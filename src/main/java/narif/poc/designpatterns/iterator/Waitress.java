package narif.poc.designpatterns.iterator;

import java.util.Iterator;

public class Waitress {

    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        final var iterator1 = pancakeHouseMenu.createIterator();
        printMenu(iterator1);
        final var iterator = dinerMenu.createIterator();
        printMenu(iterator);
    }

    private void printMenu(Iterator<MenuItem> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
