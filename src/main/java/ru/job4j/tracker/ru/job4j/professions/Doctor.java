package ru.job4j.tracker.ru.job4j.professions;

public class Doctor extends Profession {
    private String timeOfReceipt;

    public Doctor(String name, String surname, String education, String birthday, String timeOfReceipt) {
        super(name, surname, education, birthday);
        this.timeOfReceipt = timeOfReceipt;
    }

    public void getTimeOfReceipt() {
    }
}
