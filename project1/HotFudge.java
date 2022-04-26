package project1;

public class HotFudge extends ToppingDecorator {
    public HotFudge(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    public String getDescription() {
        return iceCream.getDescription() + ", hot fudge";
    }

    public double getCost() {
        double cost = iceCream.getCost();
        cost += 0.99;
        cost*=100;
        cost = Math.round(cost);
        cost/=100;
        return cost;
    }
}
