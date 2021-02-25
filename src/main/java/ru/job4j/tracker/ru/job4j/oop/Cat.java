package ru.job4j.tracker.ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.food);
    }
    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        System.out.println("The name of the cat is " + gav.name);
        System.out.print("Cat food is a ");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        System.out.println("The name of the cat is " + black.name);
        System.out.print("Cat food is a ");
        black.show();
    }
}
