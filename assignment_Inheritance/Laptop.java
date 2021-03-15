package assignment_Inheritance;

public class Laptop {

    public final String Name;
    public final Double Price;
    public final String Processor;
    public final int Ram;
    public final int HardDrive;

    public Laptop(String Name, Double Price, String Processor, int Ram, int HardDrive) {
        this.Name = Name;
        this.Price = Price;
        this.Processor = Processor;
        this.Ram = Ram;
        this.HardDrive = HardDrive;
    }

    public void printLaptopDetails(Laptop lp1) {
        System.out.println("Name: "+lp1.Name+ " Price: $"+lp1.Price+ " Processor: "+lp1.Processor+" Ram: "+lp1.Ram+"GB"+" HDD: "+lp1.HardDrive+"GB");

    }
}
