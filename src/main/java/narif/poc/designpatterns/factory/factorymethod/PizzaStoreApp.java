package narif.poc.designpatterns.factory.factorymethod;

import narif.poc.designpatterns.factory.pizza.PizzaType;

public class PizzaStoreApp {

    public static void main(String[] args) {
        final var nyStylePizzaStore = new NYStylePizzaStore();

        final var pizza = nyStylePizzaStore.orderPizza(PizzaType.CLAM);
        final var pizza1 = nyStylePizzaStore.orderPizza(PizzaType.CHEESE);
        final var pizza2 = nyStylePizzaStore.orderPizza(PizzaType.PEPPERONI);

        final var chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza(PizzaType.CHEESE);
        chicagoStylePizzaStore.orderPizza(PizzaType.CLAM);
        chicagoStylePizzaStore.orderPizza(PizzaType.PEPPERONI);

    }
}
