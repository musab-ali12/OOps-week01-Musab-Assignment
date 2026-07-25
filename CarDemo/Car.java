/*
 * Student Name: Syed Musab Ali Rizvi
 * Seat No.: B25110006156 | Section: B
 * File: Car.java
 * Purpose: Represents a simple daily-use car and controls its state safely.
 */
public class Car {
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private int fuelLevel;
    private String direction;
    private boolean musicPlaying;

    // A no-argument constructor gives every new car a sensible starting state.
    public Car() {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 50;
        this.direction = "Straight";
        this.musicPlaying = false;
    }

    public void setDetails(String brand, String color, int fuelLevel) {
        this.brand = brand;
        this.color = color;

        if (fuelLevel >= 0 && fuelLevel <= 100) {
            this.fuelLevel = fuelLevel;
        } else {
            System.out.println("Fuel level must be between 0 and 100. Default level kept.");
        }
    }

    public void startEngine() {
        if (fuelLevel == 0) {
            System.out.println(brand + " cannot start because it has no fuel.");
        } else if (engineOn) {
            System.out.println(brand + " engine is already on.");
        } else {
            engineOn = true;
            System.out.println(brand + " engine started.");
        }
    }

    public void stopEngine() {
        if (!engineOn) {
            System.out.println(brand + " engine is already off.");
            return;
        }

        speed = 0;
        engineOn = false;
        System.out.println(brand + " engine stopped. Speed reset to 0 km/h.");
    }

    public void drive() {
        if (!canMove()) {
            return;
        }

        speed = 30;
        useFuel();
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }

    public void moveFast() {
        if (!canMove()) {
            return;
        }

        speed += 20;
        useFuel();
        System.out.println(brand + " speeds up to " + speed + " km/h.");
    }

    public void moveSlow() {
        if (!engineOn) {
            System.out.println(brand + " cannot change speed because the engine is off.");
            return;
        }

        speed -= 10;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(brand + " slows down to " + speed + " km/h.");
    }

    public void moveLeft() {
        direction = "Left";
        System.out.println(brand + " turns left.");
    }

    public void moveRight() {
        direction = "Right";
        System.out.println(brand + " turns right.");
    }

    // A small daily-driver feature: music can be controlled independently.
    public void playMusic() {
        musicPlaying = !musicPlaying;
        if (musicPlaying) {
            System.out.println(brand + " music system is now playing.");
        } else {
            System.out.println(brand + " music system is now paused.");
        }
    }

    public void displayState() {
        System.out.println("\n--- " + brand + " state ---");
        System.out.println("Color       : " + color);
        System.out.println("Speed       : " + speed + " km/h");
        System.out.println("Engine on   : " + engineOn);
        System.out.println("Fuel level  : " + fuelLevel + "%");
        System.out.println("Direction   : " + direction);
        System.out.println("Music       : " + (musicPlaying ? "Playing" : "Off"));
    }

    private boolean canMove() {
        if (!engineOn) {
            System.out.println(brand + " cannot move because the engine is off.");
            return false;
        }
        if (fuelLevel == 0) {
            System.out.println(brand + " cannot move because it has no fuel.");
            return false;
        }
        return true;
    }

    private void useFuel() {
        if (fuelLevel > 0) {
            fuelLevel--;
        }
    }
}
