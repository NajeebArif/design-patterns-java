package narif.poc.designpatterns.templatemethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        biolWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    private void biolWater() {
        System.out.println("Boiling Water.");
    }
}
