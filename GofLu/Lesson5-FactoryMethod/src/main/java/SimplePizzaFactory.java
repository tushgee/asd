public class SimplePizzaFactory implements PizzaFactory {
    //This factory should often times be a Singleton
    private static PizzaFactory factory = new SimplePizzaFactory();

    private SimplePizzaFactory(){}

    public static PizzaFactory getFactory(){
        return factory;
    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("mushroom")){
            pizza = new MushroomPizza();
        } else if (type.equals("hawaii")) {
            pizza = new HawaiinPizza();
        }
        return pizza;
    }
}
