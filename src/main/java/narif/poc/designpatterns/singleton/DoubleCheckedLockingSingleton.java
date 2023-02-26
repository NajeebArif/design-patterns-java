package narif.poc.designpatterns.singleton;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton INSTANCE;

    private DoubleCheckedLockingSingleton() {
        System.out.println("Double-checked Singleton instance created.");
    }

    public static DoubleCheckedLockingSingleton getInstance(){
        if(INSTANCE==null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(INSTANCE==null) INSTANCE = new DoubleCheckedLockingSingleton();
            }
        }
        return INSTANCE;
    }

    public void displayMessage(){
        System.out.println("I am Double checked locking singleton. I am slightly better than the synchronizing the getInstance() method");
        System.out.println("Important thing here is the use of volatile keyword. Without it i am not threadsafe.");
    }
}
