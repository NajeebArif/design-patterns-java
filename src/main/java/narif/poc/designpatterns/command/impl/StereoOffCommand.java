package narif.poc.designpatterns.command.impl;

import narif.poc.designpatterns.command.Command;
import narif.poc.designpatterns.command.Stereo;

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
