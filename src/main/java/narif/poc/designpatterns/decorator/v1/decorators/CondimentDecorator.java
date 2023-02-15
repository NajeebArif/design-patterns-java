package narif.poc.designpatterns.decorator.v1.decorators;

import narif.poc.designpatterns.decorator.v1.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
