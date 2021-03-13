package Assignments_Level1;

import java.util.Scanner;

public class FaranheatToCelcius {
    //Write a program to convert Fahrenheit into Celsius

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + String.format("%.2f",celsius) + " in Celsius");
    }
}