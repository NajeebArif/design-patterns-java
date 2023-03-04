package narif.poc.designpatterns.command.simple;


/**
 * RECEIVER, entity which knows how to perform an action.
 */
public class Light {

    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}
