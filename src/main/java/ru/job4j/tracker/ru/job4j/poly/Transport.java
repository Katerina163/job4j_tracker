package ru.job4j.tracker.ru.job4j.poly;

public interface Transport {
    void go();
    void passengers(int count);
    int refuel(int fuel);
}
