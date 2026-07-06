package food;

public class BurgerBuilder{
    private String size = "Regular";
    private boolean cheese = false;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean bacon = false;

    public BurgerBuilder setSize(String size){
        this.size = size;
        return this;
    }

    public BurgerBuilder addCheese(){
        this.cheese = true;
        return this;
    }

    public BurgerBuilder addLettuce(){
        this.lettuce = true;
        return this;
    }

    public BurgerBuilder addTomato(){
        this.tomato = true;
        return this;
    }

    public BurgerBuilder addBacon(){
        this.bacon = true;
        return this;
    }

    public Burger build(){
        return new Burger(size, cheese, lettuce, tomato, bacon);
    }
}