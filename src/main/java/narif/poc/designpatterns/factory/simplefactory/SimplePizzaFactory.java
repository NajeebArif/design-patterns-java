package narif.poc.designpatterns.factory.simplefactory;

import narif.poc.designpatterns.factory.pizza.*;

public class SimplePizzaFactory {

    public static Pizza createPizza(PizzaType pizzaType){
        return switch (pizzaType){
            case CLAM -> new ClamPizza();
            case CHEESE -> new CheesePizza();
            case VEGGIE -> new VeggiePizza();
            case PEPPERONI -> new PepperoniPizza();
        };
    }
}
