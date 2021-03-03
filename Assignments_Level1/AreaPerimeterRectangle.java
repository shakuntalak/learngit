package Assignments_Level1;

public class AreaPerimeterRectangle {

    //Length and breadth of a rectangle are 5 and 7 respectively.
    // Write a program to calculate the area and perimeter of the rectangle
    //Area of rectangle=l*b
    //Perimeter=2(l+b)

    public static void main(String[] args) {

        int lenght=5,breadth=7,area=0,perimeter=0;
        area=lenght*breadth;
        perimeter=2*(lenght+breadth);
        System.out.println("Area of Rectangle is: "+area);
        System.out.println("Perimeter of rectangle is: "+perimeter);



    }
}
