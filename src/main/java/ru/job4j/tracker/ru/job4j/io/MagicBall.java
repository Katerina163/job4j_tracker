package ru.job4j.tracker.ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String answer = input.nextLine();
        int number = new Random().nextInt(3);
        switch (number) {
            case 0:
                System.out.println("Да");
                break;
            case 1:
                System.out.println("Нет");
                break;
            case 2, 3:
                System.out.println("Может быть");
                break;
        }
    }

}
