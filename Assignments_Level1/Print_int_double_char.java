package Assignments_Level1;

import java.util.Scanner;

public class Print_int_double_char {
    //Write a Java program to print an int, a double and a char on screen
    public static void main(String[] args) {
        int num_int;
        double num_double;
        char num_char;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an Integer Value: ");
        num_int= scanner.nextInt();
        System.out.println("Enter a double value: ");
        num_double=scanner.nextDouble();
        System.out.println("Enter a character: ");
        num_char=scanner.next().charAt(0);

        System.out.println("Entered integer value is: "+num_int);
        System.out.println("Entered Double value is: "+num_double);
        System.out.println("Entered character value is: "+num_char);
    }
}
