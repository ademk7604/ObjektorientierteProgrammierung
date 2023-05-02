package com.tpe.encapsulation;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleType("Taxi");
        //vehicle.getVehicleType();
        System.out.println(vehicle.getVehicleType()); // method call
    }

}
