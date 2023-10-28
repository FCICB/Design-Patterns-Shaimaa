public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory=new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        cheesePizza.prepare();
        cheesePizza.bake();
        cheesePizza.cut();
        cheesePizza.box();
        Pizza pepperoniPizza=pizzaFactory.createPizza("pepperoni");
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        pepperoniPizza.box();
    }
}
