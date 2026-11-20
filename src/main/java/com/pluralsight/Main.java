package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 1, 0, 5);
        Car dailyDriver = new Car("Blue", 5, 15, 14);
        SemiTruck hauler = new SemiTruck("White", 2, 40000, 150);
        Hovercraft bayGlider = new Hovercraft("Silver", 6, 800, 35);

        slowRide.setColor("Crimson");
        slowRide.setFuelCapacity(6);

        System.out.println("Moped -> Color: " + slowRide.getColor()
                + ", Passengers: " + slowRide.getNumberOfPassengers()
                + ", Cargo: " + slowRide.getCargoCapacity()
                + ", Fuel: " + slowRide.getFuelCapacity());

        System.out.println("Car -> Color: " + dailyDriver.getColor()
                + ", Passengers: " + dailyDriver.getNumberOfPassengers()
                + ", Cargo: " + dailyDriver.getCargoCapacity()
                + ", Fuel: " + dailyDriver.getFuelCapacity());

        System.out.println("SemiTruck -> Color: " + hauler.getColor()
                + ", Passengers: " + hauler.getNumberOfPassengers()
                + ", Cargo: " + hauler.getCargoCapacity()
                + ", Fuel: " + hauler.getFuelCapacity());

        System.out.println("Hovercraft -> Color: " + bayGlider.getColor()
                + ", Passengers: " + bayGlider.getNumberOfPassengers()
                + ", Cargo: " + bayGlider.getCargoCapacity()
                + ", Fuel: " + bayGlider.getFuelCapacity());
    }
}