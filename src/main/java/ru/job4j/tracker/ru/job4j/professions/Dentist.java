package ru.job4j.tracker.ru.job4j.professions;

public class Dentist extends Doctor {
    private Doctor doc;
    private String dread;

    public Dentist(Doctor doc, String dread) {
        this.doc = doc;
        this.dread = dread;
    }

    public void removeTooth() {}
}
