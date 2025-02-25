package com.example;

public class Vehicle {
    private String make;
    private String model;
  
    
    public Vehicle(String make, String model){
        this.make = make;
        this.model = model;

    }

    public void getInfo(){
        System.out.println(make);
        System.out.println(model);
    }
    
}
