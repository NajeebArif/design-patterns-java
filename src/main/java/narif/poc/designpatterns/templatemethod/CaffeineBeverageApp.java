package narif.poc.designpatterns.templatemethod;

public class CaffeineBeverageApp {

    public static void main(String[] args) {
        final var tea = new Tea();
        tea.prepareRecipe();

        final var coffee = new Coffee();
        coffee.prepareRecipe();
    }
}

