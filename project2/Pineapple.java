package project2;

public abstract class Pineapple {
    abstract Computer createComputer(String item);

    public Computer orderComputer(String type) {
        Computer computer = createComputer(type);
        System.out.println("--- Making a " + computer.getName() + " ---");
        computer.prepare();
        return computer;
    }
}