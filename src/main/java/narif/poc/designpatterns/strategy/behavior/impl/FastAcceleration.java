package narif.poc.designpatterns.strategy.behavior.impl;

import narif.poc.designpatterns.strategy.behavior.Acceleration;

public class FastAcceleration implements Acceleration {
    @Override
    public void accelerate() {
        System.out.println("Acceleration = SUPER FAST");
    }
}
