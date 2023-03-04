package narif.poc.designpatterns.command.simple.impl;

import narif.poc.designpatterns.command.simple.Command;
import narif.poc.designpatterns.command.simple.Stereo;

public class StereoOnWithCd implements Command {
    private final Stereo stereo;

    public StereoOnWithCd(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(5);
    }
}
