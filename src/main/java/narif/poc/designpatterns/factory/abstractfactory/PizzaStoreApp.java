package narif.poc.designpatterns.factory.abstractfactory;

import narif.poc.designpatterns.factory.pizza.PizzaType;

public class PizzaStoreApp {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza(PizzaType.PEPPERONI);
        pizzaStore.orderPizza(PizzaType.CHEESE);

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza(PizzaType.PEPPERONI);
        chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
    }
}
