package ru.job4j.tracker.ru.job4j.story;

public class BallStory {
        Ball kolobok = new Ball();
        Hare zaika = new Hare();
        Wolf volk = new Wolf();
        Fox alisa = new Fox();
        zaika.tryEat(kolobok);
        kolobok.runaway(zaika);
        volk.tryEat(kolobok);
        kolobok.runaway(volk);
        alisa.tryEat(kolobok);
        kolobok.diedOf(alisa);
}
