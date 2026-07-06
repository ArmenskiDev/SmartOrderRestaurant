package food;

public class FoodFactory {
    public Food createFood(String type){
        if (type == null || type.isEmpty()){
            return null;
        }

        if (type.equalsIgnoreCase("burger")){
            return new Burger("regular", false, false, false, false);
        }
        else if (type.equalsIgnoreCase("pizza")){
            return new Pizza();
        }
        else if (type.equalsIgnoreCase("pasta")){
            return new Pasta();
        }

        else if (type.equalsIgnoreCase("salad")){
            return new Salad();
        }

        System.out.println("Sorry, we dont have this food.");
        return null;
    }
}
