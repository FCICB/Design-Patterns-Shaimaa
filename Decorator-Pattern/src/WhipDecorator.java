public class WhipDecorator extends BeverageDecorator{
    public WhipDecorator(Beverage beverage) {
        super(beverage);
    }
    public String getDescription() {
        return super.getDescription() + ",Whiped";
    }

    @Override
    public double cost() {
        return super.cost() + 0.90;
    }
}
