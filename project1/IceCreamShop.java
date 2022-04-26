public class IceCreamShop {
    public static void main(String args[]) {
        IceCream customer1 = new DoubleScoop();
        customer1 = new Vanilla(customer1);
        customer1 = new HotFudge(customer1);
        customer1 = new Sprinkles(customer1);
        System.out.println(customer1.getDescription() + " $" + customer1.getCost());

        IceCream customer2 = new SingleScoop();
        customer2 = new Chocolate(customer2);
        customer2 = new Caramel(customer2);
        customer2 = new WhippedCream(customer2);
        System.out.println(customer2.getDescription() + " $" + customer2.getCost());
    }
}