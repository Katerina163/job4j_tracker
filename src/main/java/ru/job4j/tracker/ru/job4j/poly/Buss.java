package ru.job4j.tracker.ru.job4j.poly;

public class Buss implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ездит по дороге");
    }
}
