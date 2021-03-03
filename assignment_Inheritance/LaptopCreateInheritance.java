package assignment_Inheritance;

public class LaptopCreateInheritance extends Laptop{
    public LaptopCreateInheritance(String Name, Double Price, String Processor, int Ram, int HardDrive) {
        super(Name, Price, Processor, Ram, HardDrive);
    }

    public static void main(String[] args) {
        Laptop lp1= new Laptop("Lenova", 1000.0,"i3",2,500);
        lp1.printLaptopDetails(lp1);

        Laptop lp2= new Laptop("Dell", 1500.0,"i5",4,1);
        lp2.printLaptopDetails(lp2);

        Laptop lp3= new Laptop("Sony", 2000.0,"i9",8,1);
        lp3.printLaptopDetails(lp3);
    }

}
