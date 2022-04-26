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
        System.out.println("adding " + memory);
        System.out.println("adding " + HDD);
        System.out.println("adding " + CPU);
        System.out.println("adding " + GPU)
        for (String extra: extras) {
            System.out.println("adding " + extra + "\n");
        }
    }


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
