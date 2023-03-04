package narif.poc.designpatterns.command.undo.impl;


import narif.poc.designpatterns.command.undo.Command;
import narif.poc.designpatterns.command.undo.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
