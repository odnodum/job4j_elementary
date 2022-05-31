package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
