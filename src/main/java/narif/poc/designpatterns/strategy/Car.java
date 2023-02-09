package narif.poc.designpatterns.strategy;

import narif.poc.designpatterns.strategy.behavior.Acceleration;
import narif.poc.designpatterns.strategy.behavior.HonkBehavior;

public abstract class Car {

    private String name;

    protected HonkBehavior honkBehavior;
    protected Acceleration acceleration;

    public Car(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println(name+" is moving.");
    }

    public void accelerate(){
        acceleration.accelerate();
    }

    public void honk(){
        honkBehavior.honk();
    }
}
