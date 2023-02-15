package narif.poc.designpatterns.decorator.v1.decorators;

import narif.poc.designpatterns.decorator.v1.Beverage;

public class Soy extends CondimentDecorator {
    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost()+0.50;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+", Soy";
    }
}
