public class Burger implements Food{
    public String getName(){
        return "Burger";
    }

    public double getPrice(){
        return 12.99;
    }

    public void prepare(){
        System.out.println("Preparing the Burger");
    }

    public int getCalories(){
        return 800;
    }

    public void getDescription(){
        System.out.println("Get our tasty Burger only for $12.99");
    }
}