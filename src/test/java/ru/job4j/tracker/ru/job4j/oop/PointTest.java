package ru.job4j.tracker.ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;

public class PointTest extends TestCase {

    public void testDistance() {
        Point a = new Point(1, 5);
        Point b = new Point(89, 23);
        double result = 89.822;
        Assert.assertEquals(result, a.distance(b), 0.001);
    }

    public void testDistance3d() {
        Point a = new Point(1, 5, 0);
        Point b = new Point(89, 23, 65);
        double result = 110.873;
        Assert.assertEquals(result, a.distance3d(b), 0.001);
    }
}