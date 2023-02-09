package narif.poc.designpatterns.strategy;

import narif.poc.designpatterns.strategy.behavior.AccelerationAlgorithms;
import narif.poc.designpatterns.strategy.behavior.HonkAlgorithms;
import narif.poc.designpatterns.strategy.behavior.impl.SlowAcceleration;

public class CarSimulator {

    public static void main(String[] args) {
        simulateWhiteGini();

        simulate800();

        simulateGtr();

    }

    private static void simulateGtr() {
        final var porchaGTR = new PorchaGTR("Porcha GTR");
        porchaGTR.move();
        porchaGTR.accelerate();
        porchaGTR.honk();
        porchaGTR.setAcceleration(AccelerationAlgorithms.superSlowAcceleration);
        porchaGTR.accelerate();
        porchaGTR.move();
        porchaGTR.setHonkBehavior(HonkAlgorithms.honkType2);
        porchaGTR.honk();
    }

    private static void simulate800() {
        final var maruti800 = new Marutu800("Marutu 800");
        maruti800.move();
        maruti800.accelerate();
        maruti800.honk();
    }

    private static void simulateWhiteGini() {
        final var whiteGini = new WhiteGini("White Gini");
        whiteGini.move();
        whiteGini.accelerate();
        whiteGini.honk();
        whiteGini.setAcceleration(new SlowAcceleration());
        whiteGini.accelerate();
    }
}
