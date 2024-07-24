package cst8288.lab1;

// Author: Yao Yi
// Student number: 041115648
// Course section: CST8288_033
// Lab professor: Sazzad Hossain
// Concrete class Motocycle that implements Vehicle interface
class Motorcycle implements Vehicle {
    
    private String engine;
    private String wheels;
    
    public String getEngine(){
        return engine;
    }
    
    public void setEngine(String engine){
        this.engine = engine;
    }
    
    public String getWheels(){
        return wheels;
    }
    
     public void setWheels(String wheels){
        this.wheels = wheels;
    }
    
    // Constructor with parameters
    public Motorcycle(String engine, String wheels) {
       this.engine = engine;
       this.wheels = wheels;
    }

    // Implement methods from Vehicle interface
    @Override
    public void start() {
        System.out.println("The motorcycle is started.");
    }

    @Override
    public void stop() {
        System.out.println("The motorcycle is stopped.\n");
    }
}