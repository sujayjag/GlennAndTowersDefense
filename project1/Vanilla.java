package project1;

public class Vanilla extends FlavorDecorator {
    public Vanilla(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + " of vanilla ice cream";
    }

    public double getCost() {
        return iceCream.getCost();
    }
}
