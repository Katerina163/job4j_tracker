package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

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
            out.println("Success");
        } else {
            out.println("Error");
        }
        return true;
    }
}
