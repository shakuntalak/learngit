package Assignments_Level1;

import java.util.Scanner;

//Write a program to take two integer inputs from userand print sum and product of them.
//Take two integer inputs from user. First calculatethe sum of two then product of two. Finally, printthe sumand product of both obtained results
public class SumOfTwoInt {

    public static void main(String[] args) {
        int num1=0,num2=0,sum=0,prod=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first integer number: ");
        num1=scanner.nextInt();
        System.out.println("Enter second integer number: ");
        num2=scanner.nextInt();
        sum=num1+num2;
        prod=num1*num2;
        System.out.println("Sum of "+num1+" and "+num2+" is :"+sum);
        System.out.println("Product of "+num1+" and "+num2+" is :"+prod);
    }
}
