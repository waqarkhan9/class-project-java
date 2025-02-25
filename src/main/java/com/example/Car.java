package com.example;

/*car class constructor 
 * all the values are initialized here
 */
public class Car extends Vehicle{
    public Car(){
        super(null, null, 0);    
    }


    
 

   /*gives out car information */
   public void getCarInfo(){
    System.out.println("The information of this car is as follow" + "\n" +
    Vehicle.make +   "\n" + model  + "\n" + + year + "\n" + color
    );
   }
/*this method sets a new car values */

    
}
