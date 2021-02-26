package ru.job4j.tracker.ru.job4j.professions;

public class Programmer extends Engineer{
    private Engineer engineer;
    private String code;

    public Programmer(Engineer engineer, String code) {
        this.engineer = engineer;
        this.code = code;
    }

    public void development() {}
}
