package ru.job4j.tracker.ru.job4j.professions;

public class Builder extends Engineer {
    private Engineer engineer;
    private String repair;

    public Builder(Engineer engineer, String repair) {
        this.engineer = engineer;
        this.repair = repair;
    }

    public void construct() {}
}
