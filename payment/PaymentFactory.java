package payment;

public class PaymentFactory {
    public Payment createPayment(String type){
        if (type == null || type.isEmpty()){
            return null;
        }

        if (type.equalsIgnoreCase("cash")){
            return new CashPayment();
        }

        else if (type.equalsIgnoreCase("credit")){
            return new CreditCardPayment();
        }

        else if (type.equalsIgnoreCase("debit")){
            return new DebitCardPayment();
        }
        System.out.println("Invalid payment type.");
        return null;
    }
}
