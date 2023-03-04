package narif.poc.designpatterns.command.undo;

import narif.poc.designpatterns.command.undo.impl.*;

public class RemoteControlClient {
    public static void main(String[] args) {
        final var remoteControl = new RemoteControl();

        final var bedroom_fan = new Fan("Bedroom Fan");
        final var bedroom_light = new Light("Bedroom Light");

        final var lightOnCommand = new LightOnCommand(bedroom_light);
        final var lightOffCommand = new LightOffCommand(bedroom_light);

        final var fanHighCommand = new FanHighCommand(bedroom_fan);
        final var fanOffCommand = new FanOffCommand(bedroom_fan);
        final var fanLowCommand = new FanLowCommand(bedroom_fan);
        final var fanMediumCommand = new FanMediumCommand(bedroom_fan);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, fanHighCommand, fanOffCommand);
        remoteControl.setCommand(2, fanLowCommand, fanOffCommand);
        remoteControl.setCommand(3, fanMediumCommand, fanOffCommand);

        // TODO: WATCH OUT FOR SHARED MUTATION.

        remoteControl.onButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);

        remoteControl.offButtonWasPressed(0);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(2);
        remoteControl.offButtonWasPressed(3);
    }
}
