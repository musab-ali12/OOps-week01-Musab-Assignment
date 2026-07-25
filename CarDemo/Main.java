/*
 * Student Name: Syed Musab Ali Rizvi
 * Seat No.: B25110006156 | Section: B
 * File: Main.java
 * Purpose: Creates two independent Car objects and tests their behaviours.
 */
public class Main {
    public static void main(String[] args) {
        // bmw is a reference variable. new Car() calls the no-argument constructor
        // and creates the actual Car object in heap memory.
        Car bmw = new Car();
        Car honda = new Car();

        bmw.setDetails("BMW", "Black", 80);
        honda.setDetails("Honda Civic", "White", 35);

        System.out.println("=== BMW journey ===");
        bmw.startEngine();
        bmw.drive();
        bmw.moveFast();
        bmw.moveLeft();
        bmw.playMusic();
        bmw.displayState();

        System.out.println("\n=== Honda journey ===");
        honda.drive(); // Tests the rule that a car cannot drive while its engine is off.
        honda.startEngine();
        honda.drive();
        honda.moveRight();
        honda.moveSlow();
        honda.displayState();

        System.out.println("\n=== Final BMW check ===");
        bmw.stopEngine();
        bmw.displayState();
    }
}
