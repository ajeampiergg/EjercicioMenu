package pe.edu.upao.ejerciciomenudeliv.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import pe.edu.upao.ejerciciomenudeliv.models.Order;
import pe.edu.upao.ejerciciomenudeliv.models.Food;


@Service
public class OrderService {
    private List<Order> order;

    private List<Food> food;

    private double ratioHour;
    public OrderService(){
        this.food = new ArrayList<>();
        this.order = new ArrayList<>();
    }

    public List<Food> getAllFoods(){
        return this.food;
    }

    public List<Order> getAllOrders(){
        return this.order;
    }

    public Optional<Order> getOrderById(String id){
        return this.order.stream().filter(order -> order.getId().equals(id)).findFirst();
    }

    public List<Order> getOrderByCustName(String custName){
        return this.order.stream().filter(order -> order.getCustomerName().equalsIgnoreCase(custName)).collect(Collectors.toList());
    }

    public void addOrder(Order order){
        this.order.add(order);
    }

    public boolean removeOrderById(String id){
        return this.order.removeIf(order -> order.getId().equals(id));
    }

    public void service(Order servicio){
        servicio.setCreationTime(LocalDateTime.now());
    }

}

