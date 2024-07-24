/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cst8288.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The JUnit test for VehicleFactory class
 * 
 * @author yao yi
 */
public class VehicleFactoryTest {

    // Test the createVehicle method using a Car instance
    @Test
    public void testCreateCar() {
        Vehicle car = VehicleFactory.createVehicle("Car", "V8", "Steel");
        assertNotNull(car, "The created car should not be null");
        assertTrue(car instanceof Car, "The created vehicle should be an instance of Car");
        assertEquals("V8", ((Car)car).getEngine(), "The car engine should be 'V8'");
        assertEquals("Steel", ((Car)car).getWheels(), "The car wheels should be 'Steel'");
    }

    // Test the createVehicle method using a Motorcycle instance
    @Test
    public void testCreateMotorcycle() {
        Vehicle motorcycle = VehicleFactory.createVehicle("Motorcycle", "Two-stroke", "Aluminum Alloy");
        assertNotNull(motorcycle, "The created motorcycle should not be null");
        assertTrue(motorcycle instanceof Motorcycle, "The created vehicle should be an instance of Motorcycle");
        assertEquals("Two-stroke", ((Motorcycle)motorcycle).getEngine(), "The motorcycle engine should be 'Two-stroke'");
        assertEquals("Aluminum Alloy", ((Motorcycle)motorcycle).getWheels(), "The motorcycle wheels should be 'Aluminum Alloy'");
    }

    // Test the createVehicle method with invalid type of vehicle instance
    @Test
    public void testCreateInvalidVehicle() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            VehicleFactory.createVehicle("Plane", "Turbojet", "Magnesium Alloy");
        });
        assertEquals("Invalid vehicle type: Plane", exception.getMessage(), "Expected exception message for invalid vehicle type");
    }
    
}
