package ru.job4j.tracker.ru.job4j.professions;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public void getName(String n) {
        this.name = n;
    }
    public void getSurame(String n) {
        this.surname = n;
    }
    public void getEducation(String n) {
        this.education = n;
    }
    public void getBirthday(String n) {
        this.birthday = n;
    }
}
