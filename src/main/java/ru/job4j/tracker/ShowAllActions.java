package ru.job4j.tracker;

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
        Item[] array = tracker.findAll();
        if (array.length > 0) {
            out.println("All items:");
            for (Item i : array) {
                System.out.println(i);
            }
        } else {
            out.println("No item");
        }
        return true;
    }
}
