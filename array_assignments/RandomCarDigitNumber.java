package array_assignments;

import java.util.Arrays;
import java.util.Random;

public class RandomCarDigitNumber {
    /*
    Random car digit numberWrite a program to print random & unique car digit number●Take input  from user for number of unique car number to generate●Take format of card number to be
    MH{Random4digits}: MH3459●Make sure number generated are not duplicate
     */
    public static void main(String[] args) {
        String[] carNumber=new String[5];
        String index;
        Random random = new Random();

        for(int i=0;i<5;i++) {
            //MH{Random4digits}
            index = String.format("%04d", random.nextInt(10000));
            index="MH"+index;
            //MH3459●Make sure number generated are not duplicate
            boolean test = Arrays.asList(carNumber)
                    .contains(index);
            if(!test) {
                carNumber[i] = index;
                System.out.println(carNumber[i]);
            }
        }

    }
}
