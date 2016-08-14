package com.apendleton.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);


        System.out.print("Please enter a number: ");
        String input1 = value.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.print("Please enter a second number: ");
        String input2 = value.nextLine();
        double d2 = Double.parseDouble(input2);

        double result = d1 + d2;

        System.out.print("The sum of values is " + result);
    }
}
