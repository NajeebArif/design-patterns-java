package narif.poc.designpatterns.factory.abstractfactory;

import narif.poc.designpatterns.factory.abstractfactory.pizza.Pizza;
import narif.poc.designpatterns.factory.pizza.PizzaType;

public abstract class PizzaStore {

    public abstract Pizza createPizza(PizzaType pizzaType);

    public Pizza orderPizza(PizzaType pizzaType){
        final var pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
