package polymorphism;

public class AreaSquareRectPolymorphism {

    /*
    Create a class to print the area of a square and a rectangle.
    The class has twomethods with the same name but different number of parameters.
    The method forprinting area of rectangle has two parameters which are length and breadthrespectively
    while the other method for printing area of square has one parameterwhich is side of square.
     */

    public double area;
    public void PrintArea(double side)
    {
        area=side*side;
        System.out.println("Area of Square of side "+side+" is: "+area);
    }

    public void PrintArea(double length,double breadth)
    {
        area=length*breadth;
        System.out.println("Area of Rectangle with length "+length+" and breadth "+breadth+" is: "+area);
    }
}


class MainArea
{
    public static void main(String[] args) {
        AreaSquareRectPolymorphism area = new AreaSquareRectPolymorphism();

        area.PrintArea(5);
        area.PrintArea(2.6);

        area.PrintArea(5, 8);
        area.PrintArea(5.6, 8);

    }

}