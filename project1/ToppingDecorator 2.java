package project1;

public abstract class ToppingDecorator extends IceCream {
    IceCream iceCream;
    @Override
    public abstract String getDescription();
}
