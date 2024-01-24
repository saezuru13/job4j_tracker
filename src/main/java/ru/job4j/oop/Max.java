package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int first) {
        return max(left, max(right, first));
    }

    public static int max(int left, int right, int first, int second) {
        return max(left, max(right, first, second));
    }
}