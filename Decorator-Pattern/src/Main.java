public class Main {
    public static void main(String[] args) {
            Beverage espresso=new Espresso();
            espresso=new MilkDecorator(new WhipDecorator(new Mocha(new Espresso())));
            System.out.println(espresso.getDescription()+"\n"+espresso.cost());

    }
}
