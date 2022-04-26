package project1;
public abstract class FlavorDecorator extends IceCream {
    @Override
    public abstract String getDescription();
    protected IceCream iceCream;
}
