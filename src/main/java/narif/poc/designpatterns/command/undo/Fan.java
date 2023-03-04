package narif.poc.designpatterns.command.undo;

import static narif.poc.designpatterns.command.undo.Fan.Speed.OFF;

public class Fan {
    public Fan(String location) {
        this.location = location;
        speed = OFF;
    }

    public enum Speed{
        HIGH, MEDIUM, LOW, OFF;
    }

    private final String location;
    private Speed speed;

    public void high(){
        speed = Speed.HIGH;
        System.out.println(location + " ceiling fan is on high");
    }
    public void medium() {
        speed = Speed.MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        speed = Speed.LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        speed = Speed.OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public Speed getSpeed() {
        return speed;
    }
}
