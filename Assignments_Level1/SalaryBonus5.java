package Assignments_Level1;

import java.util.Scanner;

public class SalaryBonus5 {

    //A company decided to give bonus of 5% to employeeif his/her year of service is more than 5 years.
    // Ask user for their salary and year of service andprint the net bonus amount

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double salary,years_service;
        System.out.println("Enter the salary of Employee: ");
        salary=scanner.nextDouble();
        System.out.println("Enter number of years of service: ");
        years_service=scanner.nextDouble();

        if(years_service>=5) {
            salary = salary + salary * .05;
            System.out.println("Salary of Employee is: "+salary);
        }
        else
            System.out.println("Sal;ary of Employee is: "+salary);

    }
}
