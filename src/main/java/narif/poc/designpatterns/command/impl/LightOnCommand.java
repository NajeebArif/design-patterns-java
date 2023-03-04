package narif.poc.designpatterns.command.impl;

import narif.poc.designpatterns.command.Command;
import narif.poc.designpatterns.command.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
