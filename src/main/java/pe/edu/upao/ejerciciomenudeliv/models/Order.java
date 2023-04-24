package pe.edu.upao.ejerciciomenudeliv.models;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String id;
    private String customerName;
    private String customerEmail;
    private String status;
    private LocalDateTime creationTime;
    private String estimatedDeliveryTime;

    private List<Food> items;

    public Order(Object o, Object o1, Object o2, Object o3, Object o4, Object o5) {
    }

    public Order(String id, String customerName, String customerEmail, String status, LocalDateTime creationTime, String estimatedDeliveryTime, List<Food> items) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.status = status;
        this.creationTime = creationTime;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public List<Food> getItems() {
        return items;
    }

    public void setItems(List<Food> items) {
        this.items = items;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", status='" + status + '\'' +
                ", creationTime=" + creationTime +
                ", estimatedDeliveryTime='" + estimatedDeliveryTime + '\'' +
                ", items=" + items +
                '}';
    }
}
