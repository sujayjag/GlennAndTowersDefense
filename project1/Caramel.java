package project1;

public class Caramel extends ToppingDecorator {
    public Caramel(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    public String getDescription() {
        return iceCream.getDescription() + ", caramel";
    }


    
    public double getCost() {
        double cost = iceCream.getCost();
        cost += 0.89;
        cost*=100;
        cost = Math.round(cost);
        cost/=100;
        return cost;
    }
}
