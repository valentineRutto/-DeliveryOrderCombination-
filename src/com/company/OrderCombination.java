package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrderCombination {

    private final UserInput input;
    private ArrayList<OrderModel> list;

    /**
     * Constructor
     */
    public OrderCombination() {
        input = new UserInput();
    }

    /**
     * Initiate processing
     */
    public void processCombination() {
        list = getOrders();
        list.stream().forEach((order) -> {
            setLocations(order);
        });
        String[] centers =getLocations();
        System.out.println("Similar Orders");
        for (String place : centers) {

            System.out.println("\n" + place + "\n");
            List<OrderModel> from_here = getOrdersFromPlace(place);
            List<OrderModel> to_here = getOrdersToPlace(place);
            if (!from_here.isEmpty()) {
                System.out.println("Pick the orders below");
                System.out.println(from_here);
            }
            if (!to_here.isEmpty()) {
                System.out.println("Drop the orders below");
                System.out.println(to_here);
            }
        }
    }

    private List<OrderModel> getOrdersFromPlace(String location) {
        return list.stream().filter(p -> p.getPickLocation().equalsIgnoreCase(location)).collect(Collectors.toList());
    }

    private List<OrderModel> getOrdersToPlace(String location) {
        return list.stream().filter(p -> p.getDropLocation().equalsIgnoreCase(location)).collect(Collectors.toList());
    }

    public ArrayList<OrderModel> getOrders() {
        return input.getInputs();
    }
    protected String[] places = {};


    protected void setLocations(OrderModel order) {
        pushLocation(order.getPickLocation());
        pushLocation(order.getDropLocation());
    }

    protected String[] getLocations() {
        return this.places;
    }


    private void pushLocation(String place) {
        boolean inArray = Arrays.stream(places).anyMatch(place::equalsIgnoreCase);
        if (!inArray) {
            SendyDeliveryHelper helper = new SendyDeliveryHelper();
            places = helper.addNewItemToArray(place, places);
        }
    }
}

