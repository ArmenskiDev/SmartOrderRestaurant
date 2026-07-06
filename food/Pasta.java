package food;

public class Pasta implements Food{

    @Override
    public String getName() {
        return "Pasta";
    }

    @Override
    public double getPrice() {
        return 14.99;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing the Pasta");
    }

    @Override
    public int getCalories() {
        return 750;
    }

    @Override
    public void getDescription() {
        System.out.println("Enjoy our Pasta for only $14.99");
    }

}