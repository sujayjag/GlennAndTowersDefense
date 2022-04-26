package project1;

public class Chocolate extends FlavorDecorator {
    public Chocolate(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    
    public String getDescription() {
        return iceCream.getDescription() + " of chocolate ice cream";
    }

    
    public double getCost() {
        return iceCream.getCost();
    }
}
