package ru.job4j.tracker;

import java.util.Arrays;

public class SingleTracker {
    private Tracker tracker = new Tracker();
    private static SingleTracker stracker = null;

    private SingleTracker() {}

    public static SingleTracker getStracker() {
        if (stracker == null) {
            stracker = new SingleTracker();
        }
        return stracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}