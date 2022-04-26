package project1;

public class IceCreamStore {
    public static void main(String args[]) {

        IceCream iceCream1 = new DoubleScoop();
        iceCream1 = new Vanilla(new HotFudge( new Sprinkles(iceCream1)));
        double cost = iceCream1.getCost();
        cost*=100;
        cost = Math.round(cost);
        cost/=100;
        System.out.println(iceCream1.getDescription() + " $" + cost);

        IceCream iceCream2 = new SingleScoop();
        iceCream2 = new Chocolate(new Caramel(new WhippedCream(iceCream2)));
        cost = iceCream2.getCost();
        cost*=100;
        cost = Math.round(cost);
        cost/=100;
        System.out.println(iceCream2.getDescription() + " $" + cost);
    }
}