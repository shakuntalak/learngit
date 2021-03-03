package Assignments_Level1;

import java.util.Scanner;

public class AgeOldYoung {

    //Take input of age of 3 people by user and determine oldest and youngest among them
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age1,age2,age3;
        System.out.println("Enter the age of 3 people");
        age1=scanner.nextInt();
        age2=scanner.nextInt();
        age3=scanner.nextInt();
        if(age1>age2 && age1>age3)
            System.out.println("Age of 1st person is more: "+age1);
        else if(age2>age1 && age2>age3)
            System.out.println("Age of second person is more "+age2);
        else if(age3>age1 && age3>age2)
            System.out.println("Age of third person is more "+age3);
        else
            System.out.println("Age is same for all");

        if(age1<age2 && age1<age3)
            System.out.println("First person is youngest among the there with age: "+age1);
        else if(age2<age1 && age2<age3)
            System.out.println("Second person is youngest among the there with age: "+age2);
        else if(age3<age1 && age3<age2)
            System.out.println("Third person is youngest among the there with age: "+age3);
        else
            System.out.println("Age is same for all");
    }
}
