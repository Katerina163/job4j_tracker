package ru.job4j.tracker.ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
    }

    public static int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("The number must not be negative");
        } else {
            for (int index = 1; index <= n; index++) {
                rsl *= index;
            }
        }
        return rsl;
    }
}