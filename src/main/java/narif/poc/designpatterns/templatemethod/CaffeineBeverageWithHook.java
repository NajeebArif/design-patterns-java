package narif.poc.designpatterns.templatemethod;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe(){
        biolWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    protected boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void biolWater() {
        System.out.println("Boiling Water.");
    }
}
