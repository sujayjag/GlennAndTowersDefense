public class Sprinkles extends ToppingDecorator {
    public Sprinkles(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", sprinkles";
    }

    public double getCost() {
        return iceCream.getCost() + 0.79;
    }
}
