package ru.job4j.tracker;

import java.util.ArrayList;

public class FoundNameAction implements UserAction {
    private final Output out;

    public FoundNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Name item to be found: ");
        List<Item> item = tracker.findByName(name);
        if(item.size() >0) {
            for (Item i : item) {
                out.println(i);
            }
        } else {
            out.println("Item with this name was not found");
        }
        return true;
    }
}
