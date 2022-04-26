package project1;

public abstract class ToppingDecorator extends IceCream {
    @Override
    public abstract String getDescription();
    IceCream iceCream;
}
