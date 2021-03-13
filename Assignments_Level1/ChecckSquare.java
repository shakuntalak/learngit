package Assignments_Level1;

import java.util.Scanner;

public class ChecckSquare {

//Take values of length and breadth of a rectangle from user and check if it is square or not
public static void main(String[] args) {
    int lenght,breadth;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the length of rectangle :");
    lenght=scanner.nextInt();
    System.out.println("Enter breadth of rectangle ;");
    breadth=scanner.nextInt();

    if(lenght==breadth)
        System.out.println("It is a Square");
    else
        System.out.println("Not a Square");
}

}
