package ru.job4j.tracker;

import java.util.ArrayList;

public class ShowAllActions implements UserAction {
    private final Output out;

    public ShowAllActions(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> array = tracker.findAll();
        if (array.size() > 0) {
            out.println("All items:");
            for (Item i : array) {
                out.println(i);
            }
        } else {
            out.println("No item");
        }
        return true;
    }
}
