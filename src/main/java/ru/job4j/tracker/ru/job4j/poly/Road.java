package ru.job4j.tracker.ru.job4j.poly;

public class Road {
    public static void main(String[] args) {
        Vehicle air = new Airplane();
        Vehicle tr = new Train();
        Vehicle bu = new Buss();
        Vehicle[] array = new Vehicle[] {air, tr, bu};
        for (Vehicle i: array) {
            i.move();
        }
    }
}
