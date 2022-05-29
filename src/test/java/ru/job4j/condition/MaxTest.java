package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenLeft4Right5thenRight5() {
        int expected = 5;
        int left = 4;
        int right = 5;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenLeft7Right0thenLeft7() {
        int expected = 7;
        int left = 7;
        int right = 0;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenLeft1Right1thenLeft1() {
        int expected = 1;
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }
}