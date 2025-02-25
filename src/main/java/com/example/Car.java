package com.example;
import java.util.Scanner;

/*car class constructor 
 * all the values are initialized here
 */
public class Car extends Vehicle {
public String make;
public String model;
public int year;

    public Car(String make, String model, int year) {
      super(make, model); /*taken from the parent class */
    //  this.make = make;
     // this.model = model;
        this.year = year;
    }

    public void setMake(String newMake) {
        this.make = newMake;

    }

    public void setModel(String newModel) {
        this.model = newModel;

    }

    public void setYear(int newYear) {
        this.year = newYear;

    }

    public void carMaker(){
        

    }

    public void modifyCar(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the make of your car");
        String make = sc.nextLine();
        setMake(make);
        System.out.println("please enter model of the car");
        String model = sc.nextLine();
        setModel(model);
        System.out.println("plase enter the year of the car");
        int year = sc.nextInt();
        setYear(year);
        sc.close();
    
    }
    public void getInfo() {
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
    }

}
