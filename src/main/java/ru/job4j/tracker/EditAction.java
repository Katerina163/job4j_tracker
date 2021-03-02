package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Integer deleteid = input.askInt("Id item to be edit: ");
        String createid = input.askStr("Item to be create: ");
        Item item = new Item(createid);
        if (tracker.replace(deleteid, item)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
        return true;
    }
}
