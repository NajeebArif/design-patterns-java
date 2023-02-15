package narif.poc.designpatterns.decorator.v1;

import narif.poc.designpatterns.decorator.v1.decorators.Mocha;
import narif.poc.designpatterns.decorator.v1.decorators.Soy;
import narif.poc.designpatterns.decorator.v1.decorators.Whip;

public class CoffeeShopApp {

    public static void main(String[] args) {
        final var espresso = new Espresso();
        System.out.println(espresso.getDescription()+": $"+espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription()+": $"+houseBlend.cost());

        //Java IO is mostly based on Decorator pattern.
        final var whip = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(whip.getDescription()+": $"+whip.cost());
    }
}
