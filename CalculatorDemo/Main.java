/*
 * Student Name: Syed Musab Ali Rizvi
 * Seat No.: B25110006156 | Section: B
 * File: Main.java
 * Purpose: Demonstrates normal and edge cases for Calculator operations.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("=== Basic operations ===");
        System.out.println("12 + 8 = " + calculator.add(12, 8));
        System.out.println("12 - 8 = " + calculator.subtract(12, 8));
        System.out.println("12 x 8 = " + calculator.multiply(12, 8));
        System.out.println("12 / 4 = " + calculator.divide(12, 4));

        System.out.println("\n=== Extended operations: normal cases ===");
        System.out.println("17 % 5 = " + calculator.modulus(17, 5));
        System.out.println("2 raised to 5 = " + calculator.power(2, 5));
        System.out.println("Average of 10, 20, 30, 40 = " + calculator.average(10, 20, 30, 40));
        System.out.println("Maximum of 7, 19, 4, 12 = " + calculator.maximum(7, 19, 4, 12));

        System.out.println("\n=== Extended operations: edge cases ===");
        System.out.println("2 raised to 0 = " + calculator.power(2, 0));
        System.out.println("Average of one value (25) = " + calculator.average(25));
        System.out.println("Maximum of one value (-8) = " + calculator.maximum(-8));

        try {
            System.out.println("10 % 0 = " + calculator.modulus(10, 0));
        } catch (ArithmeticException exception) {
            System.out.println("Modulus edge case: " + exception.getMessage());
        }

        try {
            System.out.println("10 / 0 = " + calculator.divide(10, 0));
        } catch (ArithmeticException exception) {
            System.out.println("Division edge case: " + exception.getMessage());
        }

        try {
            System.out.println("Average with no values = " + calculator.average());
        } catch (IllegalArgumentException exception) {
            System.out.println("Average edge case: " + exception.getMessage());
        }

        try {
            System.out.println("Maximum with no values = " + calculator.maximum());
        } catch (IllegalArgumentException exception) {
            System.out.println("Maximum edge case: " + exception.getMessage());
        }
    }
}
