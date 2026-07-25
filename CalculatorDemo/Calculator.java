/*
 * Student Name: Khubaib Khan
 * Seat No.: B25110006066 | Section: B
 * File: Calculator.java
 * Purpose: Provides basic and extended calculator operations.
 */
public class Calculator {
    public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double divide(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return first / second;
    }

    public double modulus(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }
        return first % second;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double average(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required for an average.");
        }

        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }

    public double maximum(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required to find a maximum.");
        }

        double largest = numbers[0];
        for (double number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }
}
