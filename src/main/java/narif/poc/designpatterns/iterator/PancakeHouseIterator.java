package narif.poc.designpatterns.iterator;

import java.util.List;

@Deprecated
public class PancakeHouseIterator implements Iterator{

    private final List<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.size() > position;
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }
}
