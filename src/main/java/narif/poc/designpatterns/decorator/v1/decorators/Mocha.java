package narif.poc.designpatterns.decorator.v1.decorators;

import narif.poc.designpatterns.decorator.v1.Beverage;

public class Mocha extends CondimentDecorator {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+", Mocha";
    }
}
