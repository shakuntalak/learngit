package polymorphism;

public class Degree {
    /*
    Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
    It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having amethod
    with the same name that prints "I am an Undergraduate" and "I am aPostgraduate" respectively.
    Call the method by creating an object of each of the three classes
     */
    public void getDegree() {
        System.out.println("I got a degree");
    }

}

class Undergraduate extends Degree {

    public void printDegree() {
        System.out.println("I am an Undergraduate");
    }

}

class Postgraduate extends Degree {

    public void printDegree() {
        System.out.println("I am an Postgraduate");
    }
}



class MainDegree{

    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getDegree();

        Undergraduate UG=new Undergraduate();
        UG.printDegree();

        Postgraduate PG=new Postgraduate();
        PG.printDegree();
    }
}