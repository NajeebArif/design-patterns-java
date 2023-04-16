package narif.poc.designpatterns.iterator;

import java.util.Iterator;

public class Waitress {

    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;
    private final Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        final var iterator1 = pancakeHouseMenu.createIterator();
        printMenu(iterator1);
        final var iterator = dinerMenu.createIterator();
        printMenu(iterator);
        printMenu(cafeMenu.createIterator());
    }

    private void printMenu(Iterator<MenuItem> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
