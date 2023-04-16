package narif.poc.designpatterns.templatemethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        biolWater();
        brew();
        pourInCup();
        addCondiments();
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
