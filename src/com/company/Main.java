package com.company;

import java.util.Scanner;

import static com.company.Combination.combination;

public class Main {

    public static void main(String[] args) {

//        String[] elements = {String.valueOf('A'), String.valueOf('B'), String.valueOf('C'), String.valueOf('D'),String.valueOf('F'), String.valueOf('H')};

        Scanner s = new Scanner(System.in);
        String[] elements= new String[5];

        System.out.println("Please enter 5 order location: ");

        for (int i = 0; i < elements.length; i++) {
            elements[i] = s.nextLine();
        }

//        System.out.print("Enter order size : ");
//        Scanner sc=new Scanner(System.in);
//        int Pickloc=sc.nextInt();
//        int DropLoc=sc.nextInt();
//
//        System.out.println("Enter order locations : ");
//
//        int OrderLoc[][]=new int[Pickloc][DropLoc];
//
//
//        for(int i=0; i<Pickloc;i++)
//        {
//            for(int j=0; j<DropLoc;j++)
//            {
//                OrderLoc[i][j]=sc.nextInt();
//            }
//        }
//        System.out.print("\nData you entered : \n");
//        for(int []x:OrderLoc){
//            for(int y:x){
//                System.out.print(y+"        ");
//            }
//            System.out.println();
//        }



        combination(elements,2);

    }
}
