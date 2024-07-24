package cst8288.lab1;

// Author: Yao Yi
// Student number: 041115648
// Course section: CST8288_033
// Lab professor: Sazzad Hossain
// Concrete builder for Motorcycle that implements the VehicleBuilder interface
class MotorcycleBuilder implements VehicleBuilder {
    
    private String engine;
    private String wheels;

    // Implements the methods from VehicleBuilder interface
    @Override
    public void buildEngine(String engine) {
        System.out.println("Motorcycle is building:");
        this.engine = engine;
        System.out.println("Engine built: " + engine + " engine");
    }
    
    @Override
    public void buildWheels(String wheels) {
	this.wheels = wheels;
	System.out.println("Wheels built: 2 " + wheels + " wheels");	
        System.out.println("Motorcycle building completed.\n");
    }

    @Override
    public Vehicle build() {
        return new Motorcycle(engine, wheels);
    }

}