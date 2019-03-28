package app.PizzaOrder;

public class CreditCard extends Payment {
    private Integer number;
    private Integer expDate;
    private Integer securityNumber;

    public CreditCard(Integer number, Integer expDate, Integer securityNumber) {
        this.number = number;
        this.expDate = expDate;
        this.securityNumber = securityNumber;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "price=" + getPrice() +
                ", date=" + getDate() +
                ", number=" + number +
                ", expDate=" + expDate +
                ", securityNumber=" + securityNumber +
                '}';
    }

}
