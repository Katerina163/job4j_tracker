package ru.job4j.tracker.ru.job4j.professions;

public class Doctor extends Profession {
    private Profession prof;
    private String timeOfReceipt;

    public Doctor(Profession prof, String timeOfReceipt) {
        this.prof = prof;
        this.timeOfReceipt = timeOfReceipt;
    }

    public void getTimeOfReceipt() {
    }
}
