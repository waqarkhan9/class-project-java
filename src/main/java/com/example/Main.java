package com.example;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("toyota", "yaris",2010);
        myCar.setMake("bugati");
        myCar.setModel("veyron");
        myCar.setYear(2015);
        myCar.modifyCar();
        myCar.getInfo();
        
   
    }
}