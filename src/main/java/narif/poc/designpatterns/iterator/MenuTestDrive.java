package narif.poc.designpatterns.iterator;

public class MenuTestDrive {

    public static void main(String[] args) {
        final var pancakeHouseMenu = new PancakeHouseMenu();
        final var dinerMenu = new DinerMenu();
        final var waitress = new Waitress(pancakeHouseMenu, dinerMenu, new CafeMenu());
        waitress.printMenu();
    }
}
