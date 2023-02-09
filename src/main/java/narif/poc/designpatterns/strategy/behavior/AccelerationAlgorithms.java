package narif.poc.designpatterns.strategy.behavior;

public class AccelerationAlgorithms {

    public static final Acceleration superFastAcceleration = () -> System.out.println("SUPER FAST");
    public static final Acceleration superSlowAcceleration = () -> System.out.println("SUPER SLOW");
}
