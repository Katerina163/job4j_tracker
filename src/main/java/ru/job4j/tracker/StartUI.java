package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void editItem(Input input, Tracker tracker) {
        Integer deleteid = input.askInt("Id item to be edit: ");
        String createid = input.askStr("Item to be create: ");
        Item item = new Item(createid);
        if (tracker.replace(deleteid, item)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        Integer id = input.askInt("Id item to be delete: ");
        if (tracker.delete(id)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }

    public static void foundIdItem(Input input, Tracker tracker) {
        Integer id = input.askInt("Id item to be found: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item with this id was not found");
        } else {
            System.out.println(item.toString());
        }
    }

    public static void foundNameItem(Input input, Tracker tracker) {
        String name = input.askStr("Name item to be found: ");
        Item[] item = tracker.findByName(name);
        if(item.length >0) {
            for (Item i : item) {
                System.out.println(i);
            }
        } else {
        System.out.println("Item with this name was not found");
    }
}

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                Item[] array = tracker.findAll();
                if (array.length > 0) {
                    System.out.println("All items:");
                    for (Item i : array) {
                        System.out.println(i);
                    }
                } else {
                    System.out.println("No item");
                }
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.foundIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.foundNameItem(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
