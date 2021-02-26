package ru.job4j.tracker.ru.job4j.professions;

public class Engineer extends Profession{
    private String plan;

    public  Engineer(String name, String surname, String education, String birthday, String plan) {
        super(name, surname, education, birthday);
        this.plan = plan;
    }
    public void draw() {}
}
