package narif.poc.designpatterns.command.impl;

import narif.poc.designpatterns.command.Command;
import narif.poc.designpatterns.command.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
