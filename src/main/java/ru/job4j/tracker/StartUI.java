package ru.job4j.tracker;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
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
                System.out.print("Id item to be edit: ");
                Integer deleteid = Integer.valueOf(scanner.nextLine());
                System.out.print("Item to be create: ");
                String createid = scanner.nextLine();
                Item item = new Item(createid);
                if (tracker.replace(deleteid, item)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 3) {
                System.out.print("Id item to be delete: ");
                Integer id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 4) {
                System.out.print("Id item to be found: ");
                Integer id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Item with this id was not found");
                } else {
                    System.out.println(item.toString());
                }
            } else if (select == 5) {
                System.out.print("Name item to be found: ");
                String name = scanner.nextLine();
                Item[] item = tracker.findByName(name);
                if (item.length > 0) {
                    for (Item i : item) {
                        System.out.println(i);
                    }
                } else {
                    System.out.println("Item with this name was not found");
                }
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
        System.out.println("Select:");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
