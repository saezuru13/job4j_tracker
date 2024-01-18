package ru.job4j.tracker.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    private static int minus(int y) {
        return y - x;
    }

    private int divide(int y) {
        return y / x;
    }

    private int multiply(int y) {
        return y * x;
    }

    private int sumAllOperation(int y) {
        return Calculator.sum(y) + Calculator.minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(10));
        System.out.println(calculator.multiply(10));
        System.out.println(Calculator.sum(10));
        System.out.println(Calculator.minus(10));
        System.out.println(calculator.sumAllOperation(10));
    }
}