package Assignments_Level1;

public class square {
    //Write a program to find the square of the number 3.9

    public static void main(String[] args) {
        double num=3.9,square_num;
        square_num=num*num;
        System.out.println("The square of number "+num+" is : "+String.format("%.2f", square_num));
    }
}
