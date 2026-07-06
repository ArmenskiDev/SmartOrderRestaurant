package payment;

public class CreditCardPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid $" + amount + " using credit card.");
    }
}
