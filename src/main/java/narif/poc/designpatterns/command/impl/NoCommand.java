package narif.poc.designpatterns.command.impl;

import narif.poc.designpatterns.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        //do nothing. This is a Null Object Pattern
    }
}
