package com.example;

/*car class constructor 
 * all the values are initialized here
 */
public class Car {
    final private String make;
    final private String model;
    final private int year;
    final private String color;

    private int mileage;
    private int engineSize;
    private String gearType;

    
   public Car(String make, String model, int year, String color){
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
   }

   /*gives out car information */
   public void getCarInfo(){
    System.out.println("The information of this car is as follow" + "\n" +
    make +   "\n" + model  + "\n" + + year + "\n" + color
    );
   }
/*this method sets a new car values */

    
}
