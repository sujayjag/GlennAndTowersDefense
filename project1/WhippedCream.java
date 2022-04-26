package project1;

public class WhippedCream extends ToppingDecorator {
    public WhippedCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String getDescription() {
        return iceCream.getDescription() + ", whipped cream";
    }

    public double getCost() {
        return iceCream.getCost() + 0.50;
    }
}