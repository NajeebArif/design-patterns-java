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
        final var iterator1 = pancakeHouseMenu.createIterator();
        printMenu(iterator1);
        final var iterator = dinerMenu.createIterator();
        printMenu(iterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
