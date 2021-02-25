package ru.job4j.tracker.ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже пешеходы по лужам");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят");
        } else {
            System.out.println("Песня не найдена");
        }
    }
    public static void main(String[] args) {
        Jukebox sleep = new Jukebox();
        sleep.music(2);
    }
}
