package array_assignments;

import java.util.Scanner;

public class DayOfTheWeek {
    /*
    Day of the Week1.Make array that holds textual value of days like “Monday, Tuesday etc2.
    Let use input corresponding day3.
    Program should output String that represent day and you can assume week start Monday
    Example: User input 1: Output: Monday
     */

    public static void main(String[] args) {
        String daysOfWeek[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day number for which you want to display the Day in String");
        int dayNum=scanner.nextInt();
        if(dayNum<=0 || dayNum>7)
            System.out.println("Entered day number is not valid!! day should be between 1 to 7");
        else
        {
            System.out.println(daysOfWeek[dayNum-1]);
        }
    }
}
