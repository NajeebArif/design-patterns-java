package narif.poc.designpatterns.factory.factorymethod;

import narif.poc.designpatterns.factory.pizza.Pizza;
import narif.poc.designpatterns.factory.pizza.PizzaType;
import narif.poc.designpatterns.factory.factorymethod.chicagopizza.ChicagoStyleClamPizza;
import narif.poc.designpatterns.factory.factorymethod.chicagopizza.ChicagoStyleCheesePizza;
import narif.poc.designpatterns.factory.factorymethod.chicagopizza.ChicagoStylePepperoniPizza;
import narif.poc.designpatterns.factory.factorymethod.chicagopizza.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        return switch (pizzaType){
            case CHEESE -> new ChicagoStyleCheesePizza();
            case VEGGIE -> new ChicagoStyleVeggiePizza();
            case CLAM -> new ChicagoStyleClamPizza();
            case PEPPERONI -> new ChicagoStylePepperoniPizza();
        };
    }
}
