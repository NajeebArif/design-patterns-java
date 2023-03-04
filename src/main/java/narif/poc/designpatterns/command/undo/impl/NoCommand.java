package narif.poc.designpatterns.command.undo.impl;


import narif.poc.designpatterns.command.undo.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        //do nothing. This is a Null Object Pattern
    }

    @Override
    public void undo() {
        //do nothing. This is a Null Object Pattern
    }
}
