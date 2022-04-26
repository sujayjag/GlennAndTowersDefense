package project1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Tests {

    @Test
    public void Test1() {
        IceCream iceCreamTest1 = new DoubleScoop();
        iceCreamTest1 = new Chocolate(new HotFudge( new WhippedCream(iceCreamTest1)));
        double expectedCost = 3.99 + .99 + .5;
        expectedCost *= 100;
        expectedCost = Math.round(expectedCost);
        expectedCost /= 100;

        assertTrue(iceCreamTest1.getCost() == expectedCost);
    }

    @Test
    public void Test2() {
        IceCream iceCreamTest2 = new SingleScoop();
        iceCreamTest2 = new Vanilla(new Sprinkles( new Caramel(iceCreamTest2)));
        double expectedCost = 2.79 + 0.89 + 0.79;
        expectedCost *= 100;
        expectedCost = Math.round(expectedCost);
        expectedCost /= 100;
        assertTrue(iceCreamTest2.getCost() == expectedCost);
    }

    @Test
    public void Test3() {
        IceCream iceCreamTest2 = new SingleScoop();
        iceCreamTest2 = new Vanilla(new Sprinkles( new Caramel(iceCreamTest2)));
        assertTrue(iceCreamTest2.getDescription().equals("A single scoop, caramel, sprinkles of vanilla ice cream"));
    }

    @Test
    public void Test4() {
        IceCream iceCreamTest2 = new SingleScoop();
        iceCreamTest2 = new Vanilla(new Sprinkles( new Caramel(iceCreamTest2)));

        IceCream iceCreamTest3 = new SingleScoop();
        iceCreamTest3 = new Vanilla(new Caramel( new Sprinkles(iceCreamTest3)));
        assertTrue((iceCreamTest2.getCost() == iceCreamTest3.getCost()));
    }

    @Test
    public void Test5() {
        IceCream iceCreamTest2 = new DoubleScoop();
        iceCreamTest2 = new HotFudge(new WhippedCream(new Caramel(new Sprinkles( new Chocolate(iceCreamTest2)))));
        assertTrue(iceCreamTest2.getDescription().equals("A double scoop of chocolate ice cream, sprinkles, caramel, whipped cream, hot fudge"));
    }

}
