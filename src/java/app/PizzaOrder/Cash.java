package app.PizzaOrder;


import java.time.LocalDateTime;

public class Cash extends Payment {
    private Double change;
    private Double cashAmount;

    public Cash(Double cashAmount, Double price) {
        this.cashAmount = cashAmount;
        this.setPrice(price);
        this.setDate(LocalDateTime.now());
        this.calcChange();
    }

    public Double getChange() {
        return change;
    }

    public Double getCashAmount() {
        return cashAmount;
    }

    public void calcChange(){
        this.change = cashAmount - this.getPrice();
    }

    @Override
    public String toString() {
        return "Cash{" +
                "price=" + this.getPrice() +
                ", date=" + this.getDate() +
                ", change=" + change +
                ", cashAmount=" + cashAmount +
                '}';
    }
}
