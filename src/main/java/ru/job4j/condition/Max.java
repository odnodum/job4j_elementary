package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int left = 9;
        int right = 7;
        int res =  Max.max(left, right);
        System.out.println(res);
    }
}
