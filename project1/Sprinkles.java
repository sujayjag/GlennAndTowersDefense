package project1;

public class Sprinkles extends ToppingDecorator {
    public Sprinkles(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", sprinkles";
    }

    public double getCost() {
        double cost = iceCream.getCost();
        cost += 0.79;
        cost*=100;
        cost = Math.round(cost);
        cost/=100;
        return cost;
    }
}
