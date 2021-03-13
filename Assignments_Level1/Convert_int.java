package Assignments_Level1;

public class Convert_int {
    //Write a program to assign a value of 100.235 to a double variable and
    // then convert it to int

    public static void main(String[] args) {
        double num=100.235;
        int num_int=0;
        num_int= (int) num;
        System.out.println(num+" converted to int will give value: "+num_int);
    }
}
