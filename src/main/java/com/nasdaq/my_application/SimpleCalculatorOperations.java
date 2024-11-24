package com.nasdaq.my_application;

public class SimpleCalculatorOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        return (float) a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static double sqrt(int a) {
        return Math.sqrt(a);
    }
}
