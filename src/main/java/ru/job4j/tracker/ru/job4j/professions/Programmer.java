package ru.job4j.tracker.ru.job4j.professions;

public class Programmer extends Engineer{
    private String code;

    public Programmer(String name, String surname, String education, String birthday, String timeOfReceipt, String code) {
        super(name, surname, education, birthday, timeOfReceipt);
        this.code = code;
    }

    public void development() {}
}
