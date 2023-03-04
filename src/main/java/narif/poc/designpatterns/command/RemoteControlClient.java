package narif.poc.designpatterns.command;

import narif.poc.designpatterns.command.impl.LightOffCommand;
import narif.poc.designpatterns.command.impl.LightOnCommand;
import narif.poc.designpatterns.command.impl.StereoOffCommand;
import narif.poc.designpatterns.command.impl.StereoOnWithCd;

public class RemoteControlClient {
    public static void main(String[] args) {
        final var drawing_room_light = new Light("Drawing Room light");
        final var bedroom_light = new Light("Bedroom Light");
        final var bedroom_stereo = new Stereo("Bedroom Stereo");

        final var lightOnCommand = new LightOnCommand(drawing_room_light);
        final var lightOffCommand = new LightOffCommand(drawing_room_light);
        final var lightOnCommand1 = new LightOnCommand(bedroom_light);
        final var lightOffCommand1 = new LightOffCommand(bedroom_light);
        final var stereoOffCommand = new StereoOffCommand(bedroom_stereo);
        final var stereoOnWithCd = new StereoOnWithCd(bedroom_stereo);

        final var remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, lightOnCommand1, lightOffCommand1);
        remoteControl.setCommand(2, stereoOnWithCd, stereoOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);

        remoteControl.offButtonWasPressed(0);
        remoteControl.offButtonWasPressed(1);
        remoteControl.offButtonWasPressed(2);
    }
}
