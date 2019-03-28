package app.PizzaOrder;

import app.Enum.Topping;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrderTest {

    @Test
    public void shouldOrderPizza(){
        Customer customer = new Customer(1,"Ricardo",123456,"email.com");
        customer.createOrder(new Order(1,"Av Brasil",false));
        customer.getOrderById(1).addPizza(new Pizza(1));
        customer.getOrderById(1).getPizzaById(1).addTopping(Topping.CHICKEN);
        customer.getOrderById(1).getPizzaById(1).addTopping(Topping.MOZZARELLA);
        customer.getOrderById(1).getPizzaById(1).addTopping(Topping.WHITECHEESE);
        customer.getOrderById(1).finalizeOrder();
        customer.getOrderById(1).setPaymentCash(50d);
        customer.getOrderById(1).getPayment().finalizePayment();
        System.out.println(customer.toString());
        Assert.assertEquals("Ricardo",customer.getName());
        Assert.assertEquals(6d,customer.getOrderById(1).getPrice(),0);
        List<Topping> testToppings = new ArrayList<>();
        testToppings.add(Topping.CHICKEN);
        testToppings.add(Topping.MOZZARELLA);
        testToppings.add(Topping.WHITECHEESE);
        Assert.assertTrue(testToppings.equals(customer.getOrderById(1).getPizzaById(1).getToppings()));
    }
}
