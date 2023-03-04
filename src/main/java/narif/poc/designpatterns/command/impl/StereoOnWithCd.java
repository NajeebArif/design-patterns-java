package narif.poc.designpatterns.command.impl;

import narif.poc.designpatterns.command.Command;
import narif.poc.designpatterns.command.Stereo;

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
