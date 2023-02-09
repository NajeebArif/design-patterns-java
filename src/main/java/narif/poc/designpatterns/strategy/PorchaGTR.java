package narif.poc.designpatterns.strategy;

import narif.poc.designpatterns.strategy.behavior.Acceleration;
import narif.poc.designpatterns.strategy.behavior.AccelerationAlgorithms;
import narif.poc.designpatterns.strategy.behavior.HonkAlgorithms;
import narif.poc.designpatterns.strategy.behavior.HonkBehavior;

public class PorchaGTR extends Car{

    public PorchaGTR(String name) {
        super(name);
        acceleration = AccelerationAlgorithms.superFastAcceleration;
        honkBehavior = HonkAlgorithms.honkType1;
    }

    public void setAcceleration(Acceleration acceleration){
        super.acceleration = acceleration;
    }

    public void setHonkBehavior(HonkBehavior honkBehavior){
        super.honkBehavior = honkBehavior;
    }
}
