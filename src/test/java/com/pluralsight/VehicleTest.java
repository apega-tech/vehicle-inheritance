package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void constructor_should_initializeInheritedVehicleProperties() {
        // arrange
        String expectedColor = "Red";
        int expectedPassengers = 1;
        int expectedCargo = 0;
        int expectedFuel = 5;

        // act
        Moped slowRide = new Moped(expectedColor, expectedPassengers, expectedCargo, expectedFuel);

        // assert
        assertEquals(expectedColor, slowRide.getColor());
        assertEquals(expectedPassengers, slowRide.getNumberOfPassengers());
        assertEquals(expectedCargo, slowRide.getCargoCapacity());
        assertEquals(expectedFuel, slowRide.getFuelCapacity());
    }

    @Test
    public void setters_should_updateInheritedPropertiesOnChildClasses() {
        // arrange
        Car car = new Car("Black", 4, 12, 13);

        // act
        car.setColor("Silver");
        car.setNumberOfPassengers(5);
        car.setCargoCapacity(16);
        car.setFuelCapacity(15);

        // assert
        assertEquals("Silver", car.getColor());
        assertEquals(5, car.getNumberOfPassengers());
        assertEquals(16, car.getCargoCapacity());
        assertEquals(15, car.getFuelCapacity());
    }

    @Test
    public void subclasses_should_beInstancesOfVehicle() {
        // arrange
        Moped moped = new Moped("Yellow", 1, 2, 4);
        Car car = new Car("Green", 5, 14, 12);
        SemiTruck semiTruck = new SemiTruck("Black", 2, 50000, 200);
        Hovercraft hovercraft = new Hovercraft("Blue", 8, 1000, 40);

        // assert
        assertTrue(moped instanceof Vehicle);
        assertTrue(car instanceof Vehicle);
        assertTrue(semiTruck instanceof Vehicle);
        assertTrue(hovercraft instanceof Vehicle);
    }
}