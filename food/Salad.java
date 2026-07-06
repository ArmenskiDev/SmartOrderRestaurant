package food;

public class Salad implements Food {

    @Override
    public String getName() {
        return "Salad";
    }

    @Override
    public double getPrice() {
        return 6.25;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing the salad.");
    }

    @Override
    public int getCalories() {
        return 320;
    }

    @Override
    public void getDescription() {
        System.out.println("Enjoy our delicious salad for only $6.25");
    }

}