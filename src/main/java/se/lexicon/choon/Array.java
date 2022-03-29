package se.lexicon.choon;

public class Array {

    //1. Write a program which will store elements in an array of type ‘int’ and
    //print it out.
    //Expected output: 11 23 39 etc.

    numbers();


    int[] numbers = new int[4];

    numbers[0] = 11;
    numbers[1] = 23;
    numbers[2] = 39;
    numbers[3] = 45;
/*
    private int[] numbers = {
            "11, 23, 39, 45"
    };
    */


    public static void main(String[] args) {


        for (int value : numbers) {
            System.out.println(value);
    }
}
