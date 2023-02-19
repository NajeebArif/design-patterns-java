package narif.poc.designpatterns.factory.abstractfactory;

import narif.poc.designpatterns.factory.pizza.PizzaType;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        return switch (pizzaType){
            case CHEESE -> new CheesePizza(pizzaIngredientFactory);
            case CLAM -> new ClamPizza(pizzaIngredientFactory);
            case PEPPERONI -> new PepperoniPizza(pizzaIngredientFactory);
            case VEGGIE -> new VeggiePizza(pizzaIngredientFactory);
        };
    }
}
