package narif.poc.designpatterns.factory.abstractfactory;

import narif.poc.designpatterns.factory.abstractfactory.ingredients.*;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
