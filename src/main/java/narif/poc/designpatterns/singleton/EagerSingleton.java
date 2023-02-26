package narif.poc.designpatterns.singleton;

public class EagerSingleton {

    private static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("Eager Singleton Instance created!");
    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

    public void displayMessage(){
        System.out.println("I am an Eagerly created instance of Singleton and yes i am also thread safe");
    }
}
