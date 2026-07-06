package food;

public class Burger implements Food {
    private String size;
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean bacon;

    public Burger(String size, boolean cheese, boolean lettuce, boolean tomato, boolean bacon){
        this.size = size;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.bacon = bacon;
    }

    @Override
    public String getName(){
        return size + "Burger";
    }

    @Override
    public double getPrice(){
        return 8.99;

        if (size.equalsIgnoreCase("Large")){
            price += 2.00;
        }
        if (cheese){
            price += 1.00;
        }
        if (bacon){
            price += 1.50;
        }
        return price
    }

    @Override
    public void prepare(){
        System.out.println("Preparing the " + size + " Burger");
    }

    @Override
    public int getCalories(){
        return 800;
    }

    @Override
    public void getDescription(){
        System.out.println("Get our tasty Burger only for $12.99");
    }

    public void printDetails() {
        System.out.println("Size: " + size);
        System.out.println("Cheese: " + cheese);
        System.out.println("Lettuce: " + lettuce);
        System.out.println("Tomato: " + tomato);
        System.out.println("Bacon: " + bacon);
        System.out.println("Price: $" + getPrice());
    }
}