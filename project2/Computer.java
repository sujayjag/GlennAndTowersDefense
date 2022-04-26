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
    public String getMemory() { return memory; }
    public String getCPU() { return CPU; }
    public String getHDD() { return HDD; }
    public String getGPU() { return GPU; }
    public ArrayList<String> getExtras() { return extras; }

    void prepare() {
        System.out.println("adding " + memory);
        System.out.println("adding " + HDD);
        System.out.println("adding " + CPU);
        System.out.println("adding " + GPU);
        for (String extra: extras) {
            System.out.println("adding " + extra);
        }
    }
}
