package cst8288.lab1;

// Author: Yao Yi
// Student number: 041115648
// Course section: CST8288_033
// Lab professor: Sazzad Hossain
//Interface for VehicleBuilder
interface VehicleBuilder {
	
    // Method to build engine for vehicles
    public void buildEngine(String engine);
    // Method to build wheels for vehicles
    public void buildWheels(String wheels);
    // Method to reture a Vehicle object
    Vehicle build();
	
}