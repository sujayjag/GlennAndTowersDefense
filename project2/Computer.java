import java.util.ArrayList;

abstract public class Computer {
    String name;
    String memory;
    String CPU;
    String HDD;
    String GPU;
    ArrayList<String> extras = new ArrayList<>();

    public String getName() { return name; }

    void prepare() {
        System.out.println("Making a " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String extra: extras) {
            System.out.println("    " + topping);
        }
    }
    void bake() { System.out.println("Bake for 25 minutes at 350"); }
    void cut() { System.out.println("Cut the pizza into diagonal slices "); }
    void box() { System.out.println("Place pizza in official PizzaStore box"); }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + "----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping: toppings) {
            display.append(topping + "\n");
        }

        return display.toString();
    }
}
