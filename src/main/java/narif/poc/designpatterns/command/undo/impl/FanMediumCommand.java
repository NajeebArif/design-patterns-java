package narif.poc.designpatterns.command.undo.impl;

import narif.poc.designpatterns.command.undo.Fan;

public class FanMediumCommand extends AbstractUndoableFanCommand{
    public FanMediumCommand(Fan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.medium();
    }
}
