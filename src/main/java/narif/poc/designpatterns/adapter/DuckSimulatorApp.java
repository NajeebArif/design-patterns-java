package narif.poc.designpatterns.adapter;

public class DuckSimulatorApp {

    public static void main(String[] args) {
        final var mallardDuck = new MallardDuck();
        final var duckSimulator = new DuckSimulator(mallardDuck);
        duckSimulator.simulateDuck();

        final var wildTurkey = new WildTurkey();
        final var turkeyAdapter = new TurkeyDuckAdapter(wildTurkey);
        final var turkeyDuckAdapterSim = new DuckSimulator(turkeyAdapter);
        turkeyDuckAdapterSim.simulateDuck();

    }
}
