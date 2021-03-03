package Assignments_Level1;

import java.util.Scanner;

public class SchoolGrade {

    //A school has following rules for grading system
    //a. Below 25 - Fb. 25 to 45 - Ec. 45 to 50 - Dd.
    // 50 to 60 - Ce. 60 to 80 - Bf. Above 80 - A
    //Ask user to enter marks and print the corresponding grade
    public static void main(String[] args) {
        int marks=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks of students: ");
        marks=scanner.nextInt();
        if(marks>80)
            System.out.println("Grade of student is: A");
        else if(marks>60)
            System.out.println("Grade of student is: B");
        else if(marks>50)
            System.out.println("Grade of student is: C");
        else if(marks>45)
            System.out.println("Grade of student is: D");
        else if (marks>=25)
            System.out.println("Grade of student is: E");
        else
            System.out.println("Grade of student is: F");

    }
}
