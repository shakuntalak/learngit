package array_assignments;

import java.util.Scanner;

public class GradesAvgMinMax {
    /*
    Write a program that allows user to enter number of grades(out off 100)
    and provide them with theier average,highest & lowest scoreExample:
    Number of grades : 4 User enters: 50, 78, 69,55 Average : 63 Highest: 78 Lowest : 50
     */
    public static void main(String[] args) {
        double avgGrade=0,sum=0;
        int minGrade=0,maxGrade=0,flag=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of grades: ");
        int numberOfGrades=scanner.nextInt();

        int[] grades=new int[numberOfGrades];
        System.out.println("Enter "+numberOfGrades+" Grades: ");
        for(int i=0;i<numberOfGrades;i++)
        {
            int g=scanner.nextInt();
            if(g>=0 && g<=100){
                grades[i]=g;
                sum = sum + grades[i];
            }
            else {
                System.out.println("Your entered value is not valid, should be out of 100 ");

                flag=1;
                break;
            }
        }
        if(flag==0) {
            avgGrade = sum / numberOfGrades;
            System.out.println("Average of " + numberOfGrades + " entered grades is : " + String.format("%.2f", avgGrade));
            minGrade = grades[0];
            maxGrade = grades[0];
            for (int i = 0; i < numberOfGrades; i++) {
                if (grades[i] < minGrade)
                    minGrade = grades[i];
                if (grades[i] > maxGrade)
                    maxGrade = grades[i];
            }

            System.out.println("Highest grade is: " + maxGrade);
            System.out.println("Lowest grade is: " + minGrade);
        }
    }
}
