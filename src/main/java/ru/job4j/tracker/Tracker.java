package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;

public class Tracker {
    private final ArrayList<Item> items = new ArrayList<Item>(100);
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public Item[] findAll() {
        return items.toArray(new Item[items.size()]);
    }

    public Item[] findByName(String key) {
        Item[] array = new Item[items.size()];
        int i = 0;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getName().equals(key)) {
                array[i] = items.get(index);
                i++;
            }

        }
        array = Arrays.copyOf(array, i);
        return array;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.set(index, item);
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        int ind = indexOf(id);
        boolean rsl = ind != -1;
        if (rsl) {
            System.arraycopy(items, ind + 1, items, ind, size - ind - 1);
            items.set(size - 1, null);
            size--;
        }
        return rsl;
    }
}