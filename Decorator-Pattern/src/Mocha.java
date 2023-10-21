public class Mocha extends BeverageDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }
    public String getDescription() {
        return super.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return super.cost() + 0.50;
    }
}
