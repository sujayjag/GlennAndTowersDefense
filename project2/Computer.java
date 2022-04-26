package project2;
import java.util.ArrayList;
public abstract class Computer {
    private String name;
    private String memory;
    private String CPU;
    private String HDD;
    private String GPU;
    private ArrayList<String> extras = new ArrayList<>();

    public String getName() { return name; }

    void prepare() {
        System.out.println("adding " + getMemory());
        System.out.println("adding " + getHDD());
        System.out.println("adding " + getCPU());
        System.out.println("adding " + getGPU());
        for (String extra: getExtras()) {
            System.out.println("adding " + extra);
        }
    }


    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + getName() + "----\n");
        display.append(getMemory() + "\n");
        display.append(getCPU() + "\n");
        display.append(getHDD() + "\n");
        display.append(getGPU() + "\n");
        for (String extra: getExtras()) {
            display.append(extra + "\n");
        }

        return display.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public ArrayList<String> getExtras() {
        return extras;
    }

    public void setExtras(ArrayList<String> extras) {
        this.extras = extras;
    }
}
