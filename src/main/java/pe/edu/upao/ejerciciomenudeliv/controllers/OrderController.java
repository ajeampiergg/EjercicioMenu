package pe.edu.upao.ejerciciomenudeliv.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upao.ejerciciomenudeliv.models.Order;
import pe.edu.upao.ejerciciomenudeliv.services.OrderService;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders(){

        return ResponseEntity.ok(this.orderService.getAllOrders());
    }

    @GetMapping("orders/{Id}")
    public ResponseEntity<Order> getOrderById(@PathVariable String Id){
        Optional<Order> optionalOrder = this.orderService.getOrderById(Id);
        if(optionalOrder.isPresent()){
            return ResponseEntity.ok(optionalOrder.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/orders/{custName}")
    public ResponseEntity<List<Order>> getOrderByCustName(@RequestParam(required = false) String custName){
        if (custName!= null) {
            List<Order> orderByCustName = this.orderService.getOrderByCustName(custName);
            return ResponseEntity.ok(orderByCustName);
        }
        return ResponseEntity.ok(this.orderService.getAllOrders());
    }

    @PostMapping("/orders")
    public ResponseEntity<Order> addOrder(@RequestBody Order orden) {
        this.orderService.addOrder(orden);
        return new ResponseEntity<>(orden, HttpStatus.CREATED);
    }

    @DeleteMapping("/orders/{Id}")
    public ResponseEntity<Void> removeOrderById(@PathVariable String Id){
        boolean removed = this.orderService.removeOrderById(Id);
        if (removed) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/orders/{servicio}/entry")
    public ResponseEntity<Void> service(@PathVariable Order servicio){
        Order od = new Order(null, null, null, null, null, null);
        this.orderService.service(od);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}





