package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double difAndDivide(double first, double second) {
        return dif(first, second) + divide(first, second);
    }

    public static double allFunFromMathFunc(double first, double second) {
        return sum(first, second) + multiply(first, second) + dif(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + allFunFromMathFunc(10, 20));
    }
}
