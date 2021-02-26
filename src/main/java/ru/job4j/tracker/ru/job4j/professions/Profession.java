package ru.job4j.tracker.ru.job4j.professions;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession() {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public void getName() {
        System.out.println(name);
    }
}
