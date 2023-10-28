public class PepperoniPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Papperoni Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Papperoni Pizza");

    }

    @Override
    public void cut() {
        System.out.println("Cuting Papperoni Pizza");

    }

    @Override
    public void box() {
        System.out.println("Boxing Papperoni Pizza");

    }
}
