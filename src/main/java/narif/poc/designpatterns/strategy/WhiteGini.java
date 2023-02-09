package narif.poc.designpatterns.strategy;

import narif.poc.designpatterns.strategy.behavior.Acceleration;
import narif.poc.designpatterns.strategy.behavior.impl.FastAcceleration;
import narif.poc.designpatterns.strategy.behavior.impl.HonkType1;

public class WhiteGini extends Car{

    public WhiteGini(String name) {
        super(name);
        acceleration = new FastAcceleration();
        honkBehavior = new HonkType1();
    }

    public void setAcceleration(Acceleration acceleration){
        super.acceleration = acceleration;
    }
}
