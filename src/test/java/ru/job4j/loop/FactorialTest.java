package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int out = 5;
        int result = Factorial.calc(out);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int out = 0;
        int result = Factorial.calc(out);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int expected = 1;
        int out = 1;
        int result = Factorial.calc(out);
        Assert.assertEquals(expected, result);
    }
}