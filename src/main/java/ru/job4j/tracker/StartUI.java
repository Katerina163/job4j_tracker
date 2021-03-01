package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item i = new Item();
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = i.getTime().format(forma);
        System.out.println("Текущие дата и время: " + currentDateTimeFormat);
        Tracker trac = new Tracker();
        trac.add(i);
        System.out.println(trac.findById(1));
        System.out.println(trac.toString());
    }
}
