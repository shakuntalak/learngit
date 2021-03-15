package polymorphism;

public class PrintDataType {
    /*
    1.Create a class named 'PrintNumber' to print various numbers of differentdatatypes
    by creating different methods with the same name 'println' having aparameter for each data type.
     */

    public void PrintNumber(int num)
    {
        System.out.println("Entered integer number value is: "+num);
    }

    public void PrintNumber(float num)
    {
        System.out.println("Entered float number value is: "+num);
    }

    public void PrintNumber(Double num)
    {
        System.out.println("Entered double number value is: "+num);
    }

    public void PrintNumber(char c)
    {
        System.out.println("Entered character is: "+c);
    }

    public void PrintNumber(String string)
    {
        System.out.println("Entered string is: "+string);
    }
}



class MainClass {
    public static void main(String[] args) {
        PrintDataType p=new PrintDataType();
        p.PrintNumber(5);
        p.PrintNumber(5f);
        p.PrintNumber(555.45);
        p.PrintNumber('p');
        p.PrintNumber("Print");
    }
}
