package narif.poc.designpatterns.command.undo.impl;

import narif.poc.designpatterns.command.undo.Command;
import narif.poc.designpatterns.command.undo.Fan;

public class FanOffCommand implements Command {
    private final Fan fan;
    private Fan.Speed previousSpeed;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.off();
    }

    @Override
    public void undo() {
        switch (previousSpeed){
            case LOW -> fan.low();
            case OFF -> fan.off();
            case MEDIUM -> fan.medium();
            case HIGH -> fan.high();
        }
    }
}
