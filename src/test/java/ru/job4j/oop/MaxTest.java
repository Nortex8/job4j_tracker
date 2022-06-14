package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int forth = 4;
        Max mix = new Max();
        int result = mix.max(first, second, third, forth);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To309Then309() {
        int first = 24;
        int second = 2;
        int third = 309;
        int forth = 65;
        Max mix = new Max();
        int result = mix.max(first, second, third, forth);
        int expected = 309;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To1Then1() {
        int first = 1;
        int second = 1;
        int third = 1;
        int forth = 1;
        Max mix = new Max();
        int result = mix.max(first, second, third, forth);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}