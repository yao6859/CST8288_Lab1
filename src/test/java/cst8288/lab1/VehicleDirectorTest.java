/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cst8288.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The JUnit test for VehicleDirector class
 * 
 * @author yao yi
 */
public class VehicleDirectorTest {
    
    // Construct a director object 
    VehicleDirector director = new VehicleDirector();
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // Test the construct method using CarBuilder
    @Test
    public void testConstructCar() {
        
        VehicleBuilder carBuilder = new CarBuilder();
        Vehicle car = director.construct(carBuilder, "V8", "Steel");

        assertNotNull(car, "The constructed car should not be null");
        assertEquals("V8", ((Car) car).getEngine(), "The car engine should be 'V8'");
        assertEquals("Steel", ((Car) car).getWheels(), "The car wheels should be 'Steel'");
    }

    // Test the construct method using MotorcycleBuilder
    @Test
    public void testConstructMotorcycle() {
    
        VehicleBuilder motorcycleBuilder = new MotorcycleBuilder();
        Vehicle motorcycle = director.construct(motorcycleBuilder, "Two-stroke", "Aluminum Alloy");

        assertNotNull(motorcycle, "The constructed motorcycle should not be null");
        assertEquals("Two-stroke", ((Motorcycle) motorcycle).getEngine(), "The motorcycle engine should be 'Two-stroke'");
        assertEquals("Aluminum Alloy", ((Motorcycle) motorcycle).getWheels(), "The motorcycle wheels should be 'Aluminum Alloy'");
    }
}

