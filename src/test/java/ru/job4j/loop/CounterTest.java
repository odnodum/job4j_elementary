package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom4To12Then40() {
        int start = 4;
        int finish = 12;
        int result = Counter.sumByEven(start, finish);
        int expected = 40;
        Assert.assertEquals(expected, result);
    }
}