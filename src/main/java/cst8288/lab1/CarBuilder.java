package cst8288.lab1;

// Author: Yao Yi
// Student number: 041115648
// Course section: CST8288_033
// Lab professor: Sazzad Hossain
// Concrete builder for Car that implements the VehicleBuilder interface
class CarBuilder implements VehicleBuilder {

    private String engine;
    private String wheels;
    
    // Implements methods from VehicleBuilder interface
    @Override
    public void buildEngine(String engine) {
        System.out.println("Car is building:");
	this.engine = engine;
        System.out.println("Engine built: " + engine + " engine");	
    }

    @Override
    public void buildWheels(String wheels) {
	this.wheels = wheels;
        System.out.println("Wheels built: 4 " + wheels + " wheels");
	System.out.println("Car building completed.\n");
    }

    @Override
    public Vehicle build() {
        return new Car(engine, wheels);
    }

    
}
