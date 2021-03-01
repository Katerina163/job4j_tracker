package ru.job4j.tracker.ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Едем");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Число пассажиров " + count);
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 50;
    }
}
