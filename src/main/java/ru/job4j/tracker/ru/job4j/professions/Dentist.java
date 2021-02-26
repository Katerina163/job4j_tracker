package ru.job4j.tracker.ru.job4j.professions;

public class Dentist extends Doctor {
    private String dread;

    public Dentist(String name, String surname, String education, String birthday, String timeOfReceipt, String dread) {
        super(name, surname, education, birthday, timeOfReceipt);
        this.dread = dread;
    }

    public void removeTooth() {}
}
