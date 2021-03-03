package ru.job4j.tracker.ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class FactTest {
    @Test
    public void when5then120() {
        int n = 5;
        assertThat(Fact.calc(n), is(120));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNoCalc() {
        int rsl = Fact.calc(-7);
        assertThat(rsl, is("N could not be less then 0"));
    }
}