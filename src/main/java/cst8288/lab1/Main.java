package cst8288.lab1;

// Author: Yao Yi
// Student number: 041115648
// Course section: CST8288_033
// Lab professor: Sazzad Hossain
public class Main {
    
    // The main method to run the factory
    public static void main(String[] args) {
        
        // Create a VehicleManager instance using Singleton Pattern
        VehicleManager manager = VehicleManager.getInstance();

        // Create Vecihle instances using Builder Pattern
        VehicleDirector director = new VehicleDirector();
        VehicleBuilder carBuilder = new CarBuilder();
        VehicleBuilder motorcycleBuilder = new MotorcycleBuilder();

        System.out.println("Building with Builder Pattern");
        Vehicle car1 = director.construct(carBuilder, "Toyota VVT-i", "Steel");
        manager.addVehicle(car1);
        
        Vehicle motorcycle1 = director.construct(motorcycleBuilder, "Kawasaki Ninja", "Aluminum Alloy");
        manager.addVehicle(motorcycle1);

        // Create Vecihle instances using Simple Factory Pattern
        System.out.println("Building with Simple Factory Pattern");
        Vehicle car2 = VehicleFactory.createVehicle("Car", "Volkswagen TSI", "Aluminum Alloy");
        manager.addVehicle(car2);
        car2.start();
        car2.stop();
        
        Vehicle motorcycle2 = VehicleFactory.createVehicle("Motorcycle", "Yamaha MT", "Magnesium Alloy");
        manager.addVehicle(motorcycle2);
        motorcycle2.start();
        motorcycle2.stop();
        
    }
}