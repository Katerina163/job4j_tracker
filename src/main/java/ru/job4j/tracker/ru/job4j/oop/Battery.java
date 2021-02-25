package ru.job4j.tracker.ru.job4j.oop;

public class Battery {
    private int load;
    public Battery(int size) {
        this.load = size;
    }
    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }
    public static void main(String[] args) {
        Battery b1 = new Battery(2);
        Battery b2 = new Battery(3);
        System.out.println(b1.load + " " + b2.load);
        b1.exchange(b2);
        System.out.println(b1.load + " " + b2.load);
    }
}
