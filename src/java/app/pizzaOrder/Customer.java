package app.PizzaOrder;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final Integer id;
    private String name;
    private Integer phoneNumber;
    private String email;
    private List<Order> orders = new ArrayList<>();

    public Customer(Integer id,String name, Integer phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", orders=" + orders +
                '}';
    }

    public Order getOrderById(Integer id){
        for (int i = 0; i <orders.size(); i++){
            if (orders.get(i).getId() == id){
                return orders.get(i);
            }
        }
        return null;
    }

    public void createOrder(Order newOrder){
        this.orders.add(newOrder);
    }

}
