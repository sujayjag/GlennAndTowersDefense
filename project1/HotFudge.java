package project1;

public class HotFudge extends ToppingDecorator {
    public HotFudge(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    public String getDescription() {
        return iceCream.getDescription() + ", hot fudge";
    }

    public double getCost() {
        return iceCream.getCost() + 0.99;
    }
}
