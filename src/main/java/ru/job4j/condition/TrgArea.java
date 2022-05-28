package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double pp = (a + b + c) / 2;
        double res = pp * (pp - a) * (pp - b) * (pp - c);
        return Math.sqrt(res);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("Area (2, 2, 2) = " + rsl);
    }
}
