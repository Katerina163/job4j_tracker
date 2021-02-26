package ru.job4j.tracker.ru.job4j.professions;

public class Surgeon extends Doctor {
    private Doctor doc;
    private String operation;

    public Surgeon(Doctor doc, String operation) {
        this.doc = doc;
        this.operation = operation;
    }

    public void heal() {}
}
