package narif.poc.designpatterns.decorator.v1;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.75;
    }
}
