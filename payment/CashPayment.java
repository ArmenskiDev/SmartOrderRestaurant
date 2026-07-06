package payment;

public class CashPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid $" + amount + " using cash.");
    }
}