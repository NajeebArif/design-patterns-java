package narif.poc.designpatterns.command.simple;

import narif.poc.designpatterns.command.simple.impl.NoCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoteControl {

    List<Command> onCommands;
    List<Command> offCommands;

    public RemoteControl() {
        onCommands = initWithNoCommand();
        offCommands = initWithNoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands.add(slot, onCommand);
        offCommands.add(slot, offCommand);
    }

    public void onButtonWasPressed(int slot){
        onCommands.get(slot).execute();
    }

    public void offButtonWasPressed(int slot){
        offCommands.get(slot).execute();
    }

    private static List<Command> initWithNoCommand() {
        return new ArrayList<>(Arrays.asList(new NoCommand(), new NoCommand(), new NoCommand(), new NoCommand(), new NoCommand(), new NoCommand(), new NoCommand()));
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + onCommands +
                ", offCommands=" + offCommands +
                '}';
    }
}
