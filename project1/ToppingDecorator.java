package project1;

public abstract class ToppingDecorator extends IceCream {
    @Override
    public abstract String getDescription();
    protected IceCream iceCream;
}
