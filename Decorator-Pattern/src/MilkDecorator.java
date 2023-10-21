public class MilkDecorator extends BeverageDecorator{
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 0.60;
    }
}
