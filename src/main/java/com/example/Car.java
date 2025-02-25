package com.example;

/*car class constructor 
 * all the values are initialized here
 */
public class Car extends Vehicle {
    public String make;
    public String model;
    public int year;

    public Car(String make, String model, int year){
    super(make, model);
    this.make = make;
    this.model = model;
    this.year = year;
    }

    public void getInfo(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
    }



}
