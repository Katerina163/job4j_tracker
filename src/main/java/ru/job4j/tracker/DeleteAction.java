package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Integer id = input.askInt("Id item to be delete: ");
        if (tracker.delete(id)) {
            out.println("Success");
        } else {
            out.println("Error");
        }
        return true;
    }
}
