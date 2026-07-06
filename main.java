import food.Food;
import food.FoodFactory;
import order.Order;
import payment.Payment;
import payment.PaymentFactory;

public class main {

    public static void main(String[] args){
        FoodFactory foodFactory = new FoodFactory();

        Food pizza = foodFactory.createFood("pizza");
        Food burger = foodFactory.createFood("burger");

        Order order = new Order("Martin");
        order.addItem(pizza, 2);
        order.addItem(burger, 1);

        order.printReciept();

        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.createPayment("credit");

        if (payment != null){
            payment.pay(order.getTotal());
        }

    }
}
