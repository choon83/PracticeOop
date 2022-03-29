package se.lexicon.choon;

public class Array {

    //1. Write a program which will store elements in an array of type ‘int’ and
    //print it out.
    //Expected output: 11 23 39 etc.




    public static void main(String[] args) {

        int[] numbers = new int[] {11, 23, 39, 45};

        /*
        numbers[0] = 11;
        numbers[1] = 23;
        numbers[2] = 39;
        numbers[3] = 45;
         */

        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            System.out.println(value);

    }



    }
}
