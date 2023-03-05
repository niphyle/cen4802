package nphyle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int n = 0, output; 
        boolean validInput = false;

        Scanner scan = new Scanner(System.in);

        // Accept user input and check for invalid input
        while (!validInput) {
            try {
                System.out.println("Please enter the position of the Fibonacci sequence you would like to see the value of.");
                n = scan.nextInt();
                scan.nextLine();
                validInput = IsValid(n);

            } catch (InputMismatchException e){
                System.out.println("Invalid input, please enter a positive integer.");
                scan.next();
            }
        }

        scan.close();

        // Call recursive method
        output = recursive(n);

        // Print the output with the grammatically correct position term.
        if (n == 1) {
            System.out.println("The " + n + "st term of the Fibonacci sequence is " + output + ".");
        } else if (n == 2) {
            System.out.println("The " + n + "nd term of the Fibonacci sequence is " + output + ".");
        } else if (n == 3) {
            System.out.println("The " + n + "rd term of the Fibonacci sequence is " + output + ".");
        } else {
            System.out.println("The " + n + "th term of the Fibonacci sequence is " + output + ".");
        }
    }

    public static boolean IsValid(int position){
        boolean validInput = false;

        if (position > 0) {
            validInput = true;
        }

        return validInput;
    }

    public static int recursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursive(n-1) + recursive(n-2);
        }
    }
}
