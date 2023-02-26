package narif.poc.designpatterns.factory.abstractfactory;

import narif.poc.designpatterns.factory.abstractfactory.pizza.*;
import narif.poc.designpatterns.factory.pizza.PizzaType;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        final var chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        return switch (pizzaType){
            case CHEESE -> new CheesePizza(chicagoPizzaIngredientFactory);
            case CLAM -> new ClamPizza(chicagoPizzaIngredientFactory);
            case PEPPERONI -> new PepperoniPizza(chicagoPizzaIngredientFactory);
            case VEGGIE -> new VeggiePizza(chicagoPizzaIngredientFactory);
        };
    }
}
