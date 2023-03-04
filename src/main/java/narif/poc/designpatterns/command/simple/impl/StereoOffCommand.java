package narif.poc.designpatterns.command.simple.impl;

import narif.poc.designpatterns.command.simple.Command;
import narif.poc.designpatterns.command.simple.Stereo;

public class StereoOffCommand implements Command {
    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
