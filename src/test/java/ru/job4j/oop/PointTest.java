package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when12To35Then3dot6() {
        double expected = 3.6;
        Point a = new Point(1, 2);
        Point b = new Point(3, 5);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when46to85then4dot12() {
        double expected = 4.12;
        Point a = new Point(4, 6);
        Point b = new Point(8, 5);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}