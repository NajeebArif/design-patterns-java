package narif.poc.designpatterns.factory.factorymethod.nypizza;

import narif.poc.designpatterns.factory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese pizza";
        dough = "Thin Crust";
        sauce = "Marinara sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
