public class Pizza implements Food {
    @Override
    public String getName(){
        return "Pizza";
    }

    @Override
    public double getPrice(){
        return 20.00;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing the pizza");
    }

    @Override
    public void getDescription(){
        System.out.println("Get our delicious pizza for only $20.00");
    }

    @Override
    public int getCalories() {
        return 1200;
    }
}