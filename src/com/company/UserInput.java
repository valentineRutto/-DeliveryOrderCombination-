package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    private final Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public ArrayList<OrderModel> getInputs() {
        ArrayList<OrderModel> orders = new ArrayList<>();
        System.out.println("Enter Name of the order, pick location and deliver location\n");
        while (true) {
            orders.add(new OrderModel(getName(), getPickLocation(), getDeliverLocation()));
            if (promptMore().equalsIgnoreCase("N")) {
                break;
            }
        }
        return orders;
    }

    private String getPickLocation() {
        return this.getScannerValue("Enter pick up location");
    }

    private String getDeliverLocation() {
        return this.getScannerValue("Enter dropOff location");
    }

    private String getName() {
        return this.getScannerValue("Enter Order Name");
    }

    private String promptMore() {
        return this.getScannerValue("Do you want to add another order? Y:N");
    }

    protected String getScannerValue(String prompt) {

        System.out.println(prompt);

        return scanner.nextLine().trim().toUpperCase();
    }


}
