package Assignments_Level1;

import java.util.Scanner;

public class GratestOfTwoNum {

    public static void main(String[] args) {

        int num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number :");
        num1=scanner.nextInt();
        System.out.println("Enter the second number ;");
        num2=scanner.nextInt();
        if(num1>num2)
            System.out.println(num1+" is grater than "+num2);
        else if(num1<num2)
            System.out.println(num2+" is grater than "+num1);
        else
            System.out.println("Both numbers are equal");
    }
}
