package payment;

public class DebitCardPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid $" + amount + " using debit card.");
    }
}
