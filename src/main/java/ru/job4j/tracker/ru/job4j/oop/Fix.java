package ru.job4j.tracker.ru.job4j.oop;

public class Fix {
    private String desc;
    public void name(String n) {
        this.desc = n;
    }
    public static void main(String[] args) {
        Fix object = new Fix();
        object.name("m");
    }
}
