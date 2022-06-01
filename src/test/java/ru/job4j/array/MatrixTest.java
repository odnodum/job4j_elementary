package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void whenRow3andCell3() {
        int size = 3;
        int[][] expected = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        int[][] result = Matrix.multiple(size);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenRow5andCell5() {
        int size = 5;
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        int[][] result = Matrix.multiple(size);
        Assert.assertArrayEquals(expected, result);
    }
}