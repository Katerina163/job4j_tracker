package ru.job4j.tracker.ru.job4j.professions;

public class Engineer extends Profession{
    private Profession prof;
    private String plan;

    public  Engineer(Profession prof, String plan) {
        this.prof = prof;
        this.plan = plan;
    }
    public void draw() {}
}
