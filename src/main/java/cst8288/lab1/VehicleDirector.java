package cst8288.lab1;

// Author: Yao Yi
// Student number: 041115648
// Course section: CST8288_033
// Lab professor: Sazzad Hossain
// The VehicleDirector class
class VehicleDirector {
    // Method to construct a Vehicle object using a VehicleBuilder
    public Vehicle construct(VehicleBuilder builder, String engine, String wheels) {
        // build engine
        builder.buildEngine(engine);
        // build wheels
        builder.buildWheels(wheels);
        // return an instance
        return builder.build();
    }
}
