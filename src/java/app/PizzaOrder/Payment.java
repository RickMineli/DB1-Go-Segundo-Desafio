package app.PizzaOrder;

import java.time.LocalDateTime;


public abstract class Payment {
    private Double price;
    private LocalDateTime date;

    public Double getPrice() {
        return price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void finalizePayment(){
        System.out.println("Your " + this.toString());
    }
}
