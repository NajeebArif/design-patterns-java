package narif.poc.designpatterns.command.undo.impl;


import narif.poc.designpatterns.command.undo.Command;
import narif.poc.designpatterns.command.undo.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
