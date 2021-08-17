package homework;
import java.util.*;
import java.lang.Math;
public class CompareNumberAndCubes {
    public static void main(String[] args) {
        Scanner fScanner = new Scanner(System.in);
        System.out.println("3 options: 1. (C)ompare two numbers and see which is greater, 2. (F)ind the cube root of a number, 3. (e)xit.");
        String options = Util.readValidString(true);
        switch (options) {
            case "c":
                System.out.println("Please enter two numbers");

        }
        calculations(options);
    }
    public static void calculations(String theOption) {
        Scanner dScanner = new Scanner(System.in);
        while(theOption.toLowerCase() != "e") {
            switch(theOption.toLowerCase()) {
                case "c":
                    System.out.println("Please enter two numbers.");
                    int firstNumber = Util.readValidNumber();
                    int secondNumber = Util.readValidNumber();
                    if (firstNumber < secondNumber) {
                        System.out.println(secondNumber + " is bigger than " + firstNumber);
                    }
                    else if (firstNumber > secondNumber) {
                        System.out.println(secondNumber + " is smaller than " + firstNumber);
                    }
                    else {
                        System.out.println("Sorry, your two numbers are equal, try again.");
                    }
                break;
                case "f":
                    System.out.println("Please enter a number to find the cube root.");
                    int thecube = dScanner.nextInt();
                    System.out.println("The cube root of " + thecube + " is: " + Math.cbrt(thecube));
                    break;
                case "e":
                    System.out.println("Ok, exiting.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("You did not put any of the given options. try again.");
            }
        }
    }
    public static void compareTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println("Please enter two numbers.");
        int firstNumbere = Util.readValidNumber();
        int secondNumbere = Util.readValidNumber();
        if (firstNumber < secondNumber) {
            System.out.println(secondNumber + " is bigger than " + firstNumber);
        }
        else if (firstNumber > secondNumber) {
            System.out.println(secondNumber + " is smaller than " + firstNumber);
        }
        else {
            System.out.println("Sorry, your two numbers are equal, try again.");
        }
    }

}
