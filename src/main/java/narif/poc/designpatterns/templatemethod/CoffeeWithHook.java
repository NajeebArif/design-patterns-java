package narif.poc.designpatterns.templatemethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter.");
    }

    @Override
    public boolean customerWantsCondiments(){
        final var userInput = getUserInput();
        return userInput.equalsIgnoreCase("y");
    }

    private String getUserInput(){
        System.out.println("Would you l" +
                "ike milk and sugar with your coffee (y/n)?");
        try(final var bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            return bufferedReader.readLine();
        }catch (Exception e){
            e.printStackTrace();
            return "n";
        }
    }

    /*@Override
    protected boolean customerWantsCondiments() {
        return super.customerWantsCondiments();
    }*/
}
