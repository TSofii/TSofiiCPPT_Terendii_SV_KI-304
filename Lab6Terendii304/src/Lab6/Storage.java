package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Storage<T extends Comparable<T>> {
    private List<T> items;

    public List<T> getItems() {
        return items;
    }
    public Storage() {
        items = new ArrayList<>();
    }
    public void addItem(T item) {
        items.add(item);
    }
    public boolean removeItem(T item) {
        return items.remove(item);
    }
    public T getMaxItem() {
        return Collections.max(items);
    }
    public int getItemCount() {
        return items.size();
    }
}
