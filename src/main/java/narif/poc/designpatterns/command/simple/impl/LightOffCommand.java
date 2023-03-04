package narif.poc.designpatterns.command.simple.impl;

import narif.poc.designpatterns.command.simple.Command;
import narif.poc.designpatterns.command.simple.Light;

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
