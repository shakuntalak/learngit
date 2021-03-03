package Assignments_Level1;

import java.util.Scanner;

public class AttendenceExam {

    //A student will not be allowed to sit in exam if his/her attendence is less than 75%.
    // Take following input from userNumber of classes heldNumber of classes attended.
    // And print percentage of class attended Is student is allowed to sit in exam or not
    //Modify the above question to allow student to sitif he/she has medical cause. Ask user
    // if he/she hasmedical cause or not ( 'Y' or 'N' ) and print accordingly
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double classes_held,classes_attended;
        double percentage;
        char medicalCause;
        System.out.println("Enter number of classes held: ");
        classes_held=scanner.nextDouble();
        System.out.println("Enter number of classes attended :");
        classes_attended=scanner.nextDouble();

        percentage=((classes_attended/classes_held) * 100);
        System.out.println("Percentage of class attended: "+percentage+"%");
        if(percentage<75) {
            System.out.println("Any medical cause:y/n :");
            medicalCause = scanner.next().charAt(0);
            if(medicalCause=='y')
                System.out.println("Student is allowed to sit even if the attendance is less tha 75% as they are having some medical condition");
            else
                System.out.println("Student is not allowed to sit for exam");
        }
        else
           System.out.println("Student is allowed to sit for exam");

    }
}
