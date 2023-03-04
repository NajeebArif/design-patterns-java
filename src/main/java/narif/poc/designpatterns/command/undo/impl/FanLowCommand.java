package narif.poc.designpatterns.command.undo.impl;

import narif.poc.designpatterns.command.undo.Fan;

public class FanLowCommand extends AbstractUndoableFanCommand{

    public FanLowCommand(Fan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.low();
    }
}
