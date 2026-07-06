package order;

import java.util.ArrayList;

public class OrderManager{
    private static OrderManager instance = new OrderManager();

    private ArrayList<Order> orders;

    private OrderManager(){
        orders = new ArrayList<>();
    }

    public static OrderManager getInstance(){
        return instance;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void printAllOrders(){
        for (Order order : orders){
            order.printReciept();
            System.out.println("-------------------");
        }
    }

    public double getTotalSales(){
        double total = 0;
        for (Order order : orders){
            total += order.getTotal();
        }

        return total;
    }
}