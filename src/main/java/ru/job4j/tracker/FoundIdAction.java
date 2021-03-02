package ru.job4j.tracker;

public class FoundIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Integer id = input.askInt("Id item to be found: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item with this id was not found");
        } else {
            System.out.println(item.toString());
        }
        return true;
    }
}
