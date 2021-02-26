package ru.job4j.tracker.ru.job4j.professions;

public class Builder extends Engineer {
    private String repair;

    public Builder(String name, String surname, String education, String birthday, String timeOfReceipt, String repair) {
        super(name, surname, education, birthday, timeOfReceipt);
        this.repair = repair;
    }

    public void construct() {}
}
