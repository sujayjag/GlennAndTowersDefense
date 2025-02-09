package project1;

public class IceCreamStore {
    public static void main(String args[]) {

        IceCream iceCream1 = new DoubleScoop();
        iceCream1 = new Vanilla(new HotFudge( new Sprinkles(iceCream1)));
        System.out.println(iceCream1.getDescription() + " $" + iceCream1.getCost());

        IceCream iceCream2 = new SingleScoop();
        iceCream2 = new Chocolate(new Caramel(new WhippedCream(iceCream2)));
        System.out.println(iceCream2.getDescription() + " $" + iceCream2.getCost());
    }
}
