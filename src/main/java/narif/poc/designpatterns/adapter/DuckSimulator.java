package narif.poc.designpatterns.adapter;

public class DuckSimulator {
    private final Duck duck;

    public DuckSimulator(Duck duck) {
        this.duck = duck;
    }

    public void simulateDuck(){
        makeNoise();
        takeFlight();
    }

    public void makeNoise(){
        duck.quack();
    }

    public void takeFlight(){
        duck.fly();
    }
}
