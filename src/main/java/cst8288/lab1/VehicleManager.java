package cst8288.lab1;

import java.util.ArrayList;
import java.util.List;

// Author: Yao Yi
// Student number: 041115648
// Course section: CST8288_033
// Lab professor: Sazzad Hossain
//Singleton VehicleManager class
class VehicleManager {
    
    private static VehicleManager vehicleManager;
    private final List<Vehicle> vehicles;

    // Initialize an ArrayList to keep the Vehicle instances
    private VehicleManager() {
        vehicles = new ArrayList<>();
    }

    // Static method to get the singleton instance of VehicleManager
    public static VehicleManager getInstance() {
        if (vehicleManager == null) {
            vehicleManager = new VehicleManager();
        }
        return vehicleManager;
    }
    
    // Method to add objects into the ArrayList
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    
    // Method to retrieve objects from the ArrayList
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}