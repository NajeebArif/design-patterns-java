package narif.poc.designpatterns.strategy.behavior.impl;

import narif.poc.designpatterns.strategy.behavior.HonkBehavior;

public class HonkType2 implements HonkBehavior {

    private static final String HONK_SOUND = "PPPOOOOOO";

    @Override
    public void honk() {
        System.out.println(HONK_SOUND);
    }
}
