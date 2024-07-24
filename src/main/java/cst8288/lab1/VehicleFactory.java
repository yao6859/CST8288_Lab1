package cst8288.lab1;

// Author: Yao Yi
// Student number: 041115648
// Course section: CST8288_033
// Lab professor: Sazzad Hossain
// Simple factory for creating vehicles
class VehicleFactory {
    // Method to create instances based on user input
    public static Vehicle createVehicle(String type, String engine, String wheels) {
        switch (type.toLowerCase()) {
            case "car" -> {
                return new Car(engine, wheels);
            }
            case "motorcycle" -> {
                return new Motorcycle(engine, wheels);
            }
            default -> throw new IllegalArgumentException("Invalid vehicle type: " + type);
        }
    }
}

