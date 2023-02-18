package narif.poc.designpatterns.factory.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing: "+name);
        System.out.println("Tossing dough... "+ dough);
        System.out.println("Adding sauce... "+sauce);
        System.out.println("Adding Toppings: "+ String.join(", ", toppings));
    }

    public void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Boxing the pizza for delivery");
    }

    public String getName(){
        return name;
    }
}
