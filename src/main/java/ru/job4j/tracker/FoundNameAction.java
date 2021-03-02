package ru.job4j.tracker;

public class FoundNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Name item to be found: ");
        Item[] item = tracker.findByName(name);
        if(item.length >0) {
            for (Item i : item) {
                System.out.println(i);
            }
        } else {
            System.out.println("Item with this name was not found");
        }
        return true;
    }
}
