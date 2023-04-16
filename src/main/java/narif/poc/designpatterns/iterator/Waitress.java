package narif.poc.designpatterns.iterator;

import java.util.ArrayList;

public class Waitress {

    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        final var menuItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < menuItems.size(); i++) {
            final var menuItem = menuItems.get(i);
            System.out.println(menuItem);
        }

        final var menuItems1 = dinerMenu.getMenuItems();
        for (int i = 0; i < menuItems1.length; i++) {
            final var menuItem = menuItems1[i];
            System.out.println(menuItem);
        }
    }
}
