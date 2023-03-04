package narif.poc.designpatterns.command.undo.impl;

import narif.poc.designpatterns.command.undo.Command;
import narif.poc.designpatterns.command.undo.Fan;

public abstract class AbstractUndoableFanCommand implements Command {
    protected final Fan fan;
    protected Fan.Speed previousSpeed;

    protected AbstractUndoableFanCommand(Fan fan) {
        this.fan = fan;
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
