package project2;
import java.util.ArrayList;
public abstract class Computer {
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
        System.out.println("adding " + GPU);
        for (String extra: extras) {
            System.out.println("adding " + extra + "\n");
        }
    }


    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + "----\n");
        display.append(memory + "\n");
        display.append(CPU + "\n");
        display.append(HDD + "\n");
        display.append(GPU + "\n");
        for (String extra: extras) {
            display.append(extra + "\n");
        }

        return display.toString();
    }
}
