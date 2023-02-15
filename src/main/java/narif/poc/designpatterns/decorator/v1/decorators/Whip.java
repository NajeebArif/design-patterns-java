package narif.poc.designpatterns.decorator.v1.decorators;

import narif.poc.designpatterns.decorator.v1.Beverage;

public class Whip extends CondimentDecorator{

    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost()+0.99;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+", Whip";
    }
}
