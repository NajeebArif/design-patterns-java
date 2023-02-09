package narif.poc.designpatterns.strategy;

import narif.poc.designpatterns.strategy.behavior.impl.HonkType2;
import narif.poc.designpatterns.strategy.behavior.impl.SlowAcceleration;

public class Marutu800 extends Car{

    public Marutu800(String name) {
        super(name);
        acceleration = new SlowAcceleration();
        honkBehavior = new HonkType2();
    }
}
