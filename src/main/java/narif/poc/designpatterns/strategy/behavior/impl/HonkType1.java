package narif.poc.designpatterns.strategy.behavior.impl;

import narif.poc.designpatterns.strategy.behavior.HonkBehavior;

public class HonkType1 implements HonkBehavior {

    private static final String HONK_SOUND = "PEEEEP";

    @Override
    public void honk() {
        System.out.println(HONK_SOUND);
    }
}
