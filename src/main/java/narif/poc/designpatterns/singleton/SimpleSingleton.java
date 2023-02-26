package narif.poc.designpatterns.singleton;

public class SimpleSingleton {

    private static SimpleSingleton INSTANCE;

    private SimpleSingleton(){
        System.out.println("Simple Singleton Instance created.");
    }

    public static synchronized SimpleSingleton getInstance(){
        if(INSTANCE == null) INSTANCE = new SimpleSingleton();
        return INSTANCE;
    }

    public void displayMessage(){
        System.out.println("I am a slow singleton implementation.");
        System.out.println("I will synchronize the getInstance() method everytime it will be called.");
    }
}
