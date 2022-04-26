package project1;

public class WhippedCream extends ToppingDecorator {
    public WhippedCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", whipped cream";
    }

    public double getCost() {
        double cost = iceCream.getCost();
        cost += 0.50;
        cost*=100;
        cost = Math.round(cost);
        cost/=100;
        return cost;
    }
}