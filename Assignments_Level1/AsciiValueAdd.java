package Assignments_Level1;

public class AsciiValueAdd {

    //Write a program to add 3 to the ASCII value of the character 'd' and
    // print the equivalent character.
    public static void main(String[] args) {
        char c='d';
        int ascii_num=c;
        System.out.println("ASCII value of 'd' is: "+ascii_num);
        ascii_num=ascii_num+3;
        c= (char) ascii_num;
        System.out.println(c);
    }
}
