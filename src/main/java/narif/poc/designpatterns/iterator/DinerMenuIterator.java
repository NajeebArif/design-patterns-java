package narif.poc.designpatterns.iterator;

public class DinerMenuIterator implements Iterator {
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
}
