package com.tpe.encapsulation;

public class Vehicle {
    private String VehicleType;

    private boolean isInspected;

    private int year;

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public boolean isInspected() {
        return isInspected;
    }

    public void setInspected(boolean inspected) {
        isInspected = inspected;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
