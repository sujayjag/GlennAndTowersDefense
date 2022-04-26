package project1;

public abstract class IceCream {
    protected String description = "Basic Ice Cream";

    public String getDescription() {
        return this.description;
    }

    public abstract double getCost();
}
