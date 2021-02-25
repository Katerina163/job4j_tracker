package ru.job4j.tracker.ru.job4j.oop;

public class Max {
    public static int max(int a, int b) {
        return a >= b ? a : b;
    }
    public static int max(int a, int b, int c) {
        return Max.max(Max.max(a, b), c);
    }
    public static int max(int a, int b, int c, int d) {
        return Max.max(Max.max(a, b, c), d);
    }
}
