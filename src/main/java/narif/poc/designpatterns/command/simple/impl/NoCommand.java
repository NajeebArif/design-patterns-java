package narif.poc.designpatterns.command.simple.impl;

import narif.poc.designpatterns.command.simple.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        //do nothing. This is a Null Object Pattern
    }
}
