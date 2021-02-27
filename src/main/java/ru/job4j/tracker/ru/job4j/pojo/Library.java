package ru.job4j.tracker.ru.job4j.pojo;

public class Library {
    Book alphabet = new Book("Алфавит", 40);
    Book cookbook = new Book("Национальная китайская кухня", 150);
    Book encyclopedia = new Book("Дикая природа", 250);
    Book artbook = new Book("Мандалорец", 200);
    Book clean = new Book("Clean code", 5);
    Book[] shelf = new Book[5];
    shelf[0] = alphabet;
    shelf[1] = cookbook;
    shelf[2] = encyclopedia;
    shelf[3] = artbook;
    shelf[4] = clean;
    for (int index = 0; index < shelf.length; index++) {
        Book book = shelf[index];
        System.out.println(book.getName() + " - " + book.getNumberOfPages());
    }
    shelf[0] = artbook;
    shelf[3] = alphabet;
    System.out.println("После перестановки:");
    for (int index = 0; index < shelf.length; index++) {
        Book book = shelf[index];
        System.out.println(book.getName() + " - " + book.getNumberOfPages());
    }
    System.out.println("Киниги Clean code:");
    for (int index = 0; index < shelf.length; index++) {
        if (shelf[index].equals("Clean code")) {
            Book book = shelf[index];
            System.out.println(book.getName() + " - " + book.getNumberOfPages());
        }
    }
}
