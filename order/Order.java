package order;

import java.util.ArrayList;
import food.Food;

public class Order {
    private String customerName;
    private ArrayList<OrderItem> items;

    public Order(String customerName){
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(Food food, int quantity){
        OrderItem item = new OrderItem(food, quantity);
        items.add(item);
    }

    public double getTotal(){
        double total = 0;
        for (OrderItem item : items){
            total += item.getSubtotal();
        }
        return total;
    }

    public void printReciept(){
        System.out.println("Customer: " + customerName);
        System.out.println("Items: " );
        for (OrderItem item : items){
            item.printItem();
        }
        System.out.println("Total: $" + getTotal());
    }

    public String getCustomerName(){
        return customerName;
    }
    public ArrayList<OrderItem> getItems(){
        return items;
    }
}
