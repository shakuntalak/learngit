package Assignments_Level1;

import java.util.Scanner;

public class AbsoluteValueNum {
    //Write a program to print absolute vlaue of a numberentered by user.
    // E.g.-INPUT: 1        OUTPUT:
    // 1INPUT: -1        OUTPUT: 1

    public static void main(String angt[]){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter a number :");
        num=scanner.nextInt();
// Finding absolute value
        num=Math.abs(num);
        System.out.println("Absolute value:"+num);
    }
}
