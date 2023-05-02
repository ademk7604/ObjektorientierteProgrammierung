package com.tpe.inheritance;

public class Toyota {

    protected  String brand="Toyota";
    protected String model="Model unspecified";
    protected String fuel="Fuel unspecified";


    protected void motor(){
        System.out.println("Toyota uses environmentally friendly engines");
    }

    protected void battery (){
        System.out.println("Toyota uses batteries depending on the model");
    }
}
