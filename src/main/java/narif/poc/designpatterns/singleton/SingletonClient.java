package narif.poc.designpatterns.singleton;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SingletonClient {

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try{
            hr();
            runSlowSingletonImplementation();
            hr();
            runEagerSingletonImplementation();
            hr();
            runDoubleCheckedLockingImplementation();
            hr();
            executorService = Executors.newCachedThreadPool();
            submitSlowSingletons(executorService);
            submitEagerSingleton(executorService);
            submitDoubleCheckedLockingSingleton(executorService);
            final var b = executorService.awaitTermination(10, TimeUnit.SECONDS);
            hr();
            System.out.println("Executor Service Terminated?: "+b);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
    }

    private static void submitDoubleCheckedLockingSingleton(ExecutorService executorService) {
        executorService.submit(SingletonClient::runDoubleCheckedLockingImplementation);
        executorService.submit(SingletonClient::runDoubleCheckedLockingImplementation);
        executorService.submit(SingletonClient::runDoubleCheckedLockingImplementation);
        executorService.submit(SingletonClient::runDoubleCheckedLockingImplementation);
    }

    private static void submitEagerSingleton(ExecutorService executorService) {
        executorService.submit(SingletonClient::runEagerSingletonImplementation);
        executorService.submit(SingletonClient::runEagerSingletonImplementation);
        executorService.submit(SingletonClient::runEagerSingletonImplementation);
        executorService.submit(SingletonClient::runEagerSingletonImplementation);
    }

    private static void submitSlowSingletons(ExecutorService executorService) {
        executorService.submit(SingletonClient::runSlowSingletonImplementation);
        executorService.submit(SingletonClient::runSlowSingletonImplementation);
        executorService.submit(SingletonClient::runSlowSingletonImplementation);
        executorService.submit(SingletonClient::runSlowSingletonImplementation);
    }

    private static void runDoubleCheckedLockingImplementation() {
        final var instance = DoubleCheckedLockingSingleton.getInstance();
        instance.displayMessage();
        final var instance1 = DoubleCheckedLockingSingleton.getInstance();
        instance1.displayMessage();
    }

    private static void runEagerSingletonImplementation() {
        final var instance = EagerSingleton.getInstance();
        instance.displayMessage();
        final var instance1 = EagerSingleton.getInstance();
        instance1.displayMessage();
    }

    private static void runSlowSingletonImplementation() {
        final var instance = SimpleSingleton.getInstance();
        instance.displayMessage();
        final var instance1 = SimpleSingleton.getInstance();
        instance1.displayMessage();
    }

    private static void hr() {
        System.out.println("************************************************************************************");
    }
}
