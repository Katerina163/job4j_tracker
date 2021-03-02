package ru.job4j.tracker;

public class StubInput implements Input {
    private int id;
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }
    public StubInput(int id) {
        this.id = id;
    }
    public StubInput(String[] answers, int id) {
        this.answers = answers;
        this.id = id;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
