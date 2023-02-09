package narif.poc.designpatterns.strategy.behavior.impl;

import narif.poc.designpatterns.strategy.behavior.Acceleration;

public class SlowAcceleration implements Acceleration {
    @Override
    public void accelerate() {
        System.out.println("Acceleration = SUPER SLOW");
    }
}
