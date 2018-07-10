package com.company;gi

import java.util.Scanner;

import static com.company.Combination.combination;

public class Main {

    public static void main(String[] args) {

//        String[] elements = {String.valueOf('A'), String.valueOf('B'), String.valueOf('C'), String.valueOf('D'),String.valueOf('F'), String.valueOf('H')};

        Scanner s = new Scanner(System.in);
        String[] elements= new String[5];

        System.out.println("Please enter 20 names to sort");

        for (int i = 0; i < elements.length; i++) {
            elements[i] = s.nextLine();
        }

        //Just to test
        System.out.println(elements[0]);

        combination(elements,3);

    }
}
