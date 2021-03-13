package Assignments_Level1;

import java.util.Scanner;

public class LowerOrUpperCase {

    //Write a program to check whether a entered character
    // is lowercase ( a to z ) or uppercase ( A to Z ).
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c=scanner.next().charAt(0);
        if(c>='A' && c<='Z')
            System.out.println("Entered character is in upper case");
        else if (c>='a' && c<='z')
            System.out.println("Entered character is in lower case");
        else
            System.out.println("Entered character is not an alphabet");
    }
}
