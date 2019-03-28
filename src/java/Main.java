import app.Enum.Topping;
import app.PizzaOrder.Customer;
import app.PizzaOrder.Order;
import app.PizzaOrder.Pizza;

public class Main {

    public static void main(String[] args){
        Customer customer = new Customer(786,"Ricardo", 22, "rick.com");
        System.out.println(customer.getOrders());
        customer.createOrder(new Order(1,"Av.Brasil 1",false));
        customer.createOrder(new Order(2,"Av.Brasil 2",false));
        customer.createOrder(new Order(3,"Av.Brasil 3",false));
        customer.createOrder(new Order(4,"Av.Brasil 4",false));
        customer.createOrder(new Order(5,"Av.Brasil 5",false));
        customer.createOrder(new Order(6,"Av.Brasil 6",false));

        customer.getOrderById(1).addPizza(new Pizza(1));
        customer.getOrderById(1).getPizzaById(1).addTopping(Topping.PEPPERONI);

        customer.getOrderById(2).addPizza(new Pizza(1));
        customer.getOrderById(2).getPizzaById(1).addTopping(Topping.MUSHROOM);
        customer.getOrderById(2).setPaymentCredit(123456789,1221,123);
        System.out.println(customer.getOrderById(1));
        System.out.println(customer.getOrderById(2));
        System.out.println(customer.getOrderById(1).getPayment());
        customer.getOrderById(1).finalizeOrder();
        customer.getOrderById(1).setPaymentCash(100d);
        System.out.println(customer.getOrderById(1).toString());
    }

}
