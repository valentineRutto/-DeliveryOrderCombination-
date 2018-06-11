package com.company;

public class OrderModel {

    private String name;

    private String pickUpLocation;

    private String dropOffLocation;


    public OrderModel(String the_name, String pickup_at, String dropoff_at) {
        this.name = the_name;
        this.pickUpLocation = pickup_at;
        this.dropOffLocation = dropoff_at;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPickLocation() {
        return pickUpLocation;
    }

    public void setPickLocation(String pickLocation) {
        this.pickUpLocation = pickLocation;
    }

    public String getDropLocation() {
        return dropOffLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropOffLocation = dropLocation;
    }

    @Override
    public String toString() {
        return "Order " + name + ": From " + pickUpLocation + " TO " + dropOffLocation;
    }

}
