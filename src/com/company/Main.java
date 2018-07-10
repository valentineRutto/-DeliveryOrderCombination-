package com.company;

import static com.company.Combination.combination;

public class Main {

    public static void main(String[] args) {

//        OrderCombination combination = new OrderCombination();
//        combination.processCombination();


        Object[] elements = new Object[] {'A','B','C','D','E', 'F', 'G', 'H'};

        combination(elements,7);
    }
}
