package narif.poc.designpatterns.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null)
            return false;
        else return true;
    }

    @Override
    public MenuItem next() {
        final var item = items[position];
        position++;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("You should not be trying to remove menu items.");
    }
}
