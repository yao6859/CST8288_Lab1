/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cst8288.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

/**
 * The JUnit test class for VehiceManager
 * 
 * @author yao yi
 */
public class VehicleManagerTest {

    // Clear VehicleManager before each test
    @BeforeEach
    public void setUp() {
        VehicleManager vehicleManager = VehicleManager.getInstance();
        vehicleManager.getVehicles().clear();
    }

    // Test the single pattern
    @Test
    public void testSingleton() {
        VehicleManager manager1 = VehicleManager.getInstance();
        VehicleManager manager2 = VehicleManager.getInstance();
        assertSame(manager1, manager2, "Two instance didn't refer to the same object, violate Singleton Pattern.");
    }

    // Test the addVehicle() method
    @Test
    public void testAddVehicle() {
        VehicleManager manager = VehicleManager.getInstance();
        Vehicle car = new Car("Toyota VVT-i", "Steel");
        manager.addVehicle(car);
        List<Vehicle> vehicles = manager.getVehicles();
        assertEquals(1, vehicles.size(), "The vehicles list should contain one vehicle");
        assertSame(car, vehicles.get(0), "The vehicle in the list should be the same as the one added");
    }

    // Test the getVehicle method
    @Test
    public void testGetVehicles() {
        VehicleManager manager = VehicleManager.getInstance();
        Vehicle car1 = new Car("Volkswagen TSI", "Aluminum Alloy");
        Vehicle car2 = new Car("Yamaha MT", "Magnesium Alloy");
        manager.addVehicle(car1);
        manager.addVehicle(car2);
        List<Vehicle> vehicles = manager.getVehicles();
        assertEquals(2, vehicles.size(), "The vehicles list should contain two vehicles");
        assertTrue(vehicles.contains(car1), "The vehicles list should contain car1");
        assertTrue(vehicles.contains(car2), "The vehicles list should contain car2");
    }
}
