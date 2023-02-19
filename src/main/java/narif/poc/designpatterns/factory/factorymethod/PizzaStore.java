package narif.poc.designpatterns.factory.factorymethod;

import narif.poc.designpatterns.factory.pizza.Pizza;
import narif.poc.designpatterns.factory.pizza.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType){
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(PizzaType pizzaType);
}
