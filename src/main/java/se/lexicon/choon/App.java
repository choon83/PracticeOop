package se.lexicon.choon;

public class App {

public static void main (String[]args)
{

    /*
    String firstName = "Choon";
    String lastName = "Yee";
    System.out.println (firstName + " " + lastName);
     */

    /*
    double decimal1 = 3.14;
    double decimal2 = 1.86;
    double result = (decimal1+decimal2);
    System.out.println(result);
     */




}

}

/*
public class App {

    public static void main(String[]args)
    {
        System.out.println( "Hello" );
        System.out.println( "Choon" );
    }
*/

/*
import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        year = scan.nextInt();
        scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}
*/

/*
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();


        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));

    }

}
*/

/*
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter num1");
        int number1 = scanner.nextInt();
        System.out.println("enter num2");
        int number2 = scanner.nextInt();
        System.out.println("result");
        int result = number1 - number2; // 10 - 6 = 4
        System.out.println(result);
        if (result > 2){
            System.out.println("test condition1");
        } else {
            System.out.println("test condition2");
        }
    }

}
*/
