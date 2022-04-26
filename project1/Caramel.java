package project1;

public class Caramel extends ToppingDecorator {
    public Caramel(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    public String getDescription() {
        return iceCream.getDescription() + ", caramel";
    }


    
    public double getCost() {
        return iceCream.getCost() + 0.89;
    }
}
