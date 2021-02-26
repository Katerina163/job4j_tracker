package ru.job4j.tracker.ru.job4j.professions;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon(String name, String surname, String education, String birthday, String timeOfReceipt, String operation) {
        super(name, surname, education, birthday, timeOfReceipt);
        this.operation = operation;
    }

    public void heal() {}
}
