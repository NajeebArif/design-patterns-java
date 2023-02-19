package narif.poc.designpatterns.factory.factorymethod;

import narif.poc.designpatterns.factory.pizza.Pizza;
import narif.poc.designpatterns.factory.pizza.PizzaType;
import narif.poc.designpatterns.factory.factorymethod.nypizza.NYStyleClamPizza;
import narif.poc.designpatterns.factory.factorymethod.nypizza.NYStyleCheesePizza;
import narif.poc.designpatterns.factory.factorymethod.nypizza.NYStylePepperoniPizza;
import narif.poc.designpatterns.factory.factorymethod.nypizza.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        return switch (pizzaType){
            case CHEESE -> new NYStyleCheesePizza();
            case VEGGIE -> new NYStyleVeggiePizza();
            case CLAM -> new NYStyleClamPizza();
            case PEPPERONI -> new NYStylePepperoniPizza();
        };
    }
}
