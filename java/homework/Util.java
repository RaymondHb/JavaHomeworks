package homework;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class Util {
    public static int readValidNumber(boolean allowNegativeNumbers) {
        int inputNumber = 0;
        boolean condition = true;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                inputNumber = sc.nextInt();
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Enter whole numbers only.");
                sc.next();
            }
            if (!allowNegativeNumbers && inputNumber < 0) {
                System.out.println("Please enter positive number.");
                condition = true;
            }
        } while (condition == true);
        return inputNumber;
    }

    public static int readValidNumber() {
        return readValidNumber(false);
    }

    public static String readValidString(boolean charFlag) {
        String inputString = "";
        Scanner aScanner = new Scanner(System.in);
        boolean condition = true;
        do {
            try {
                inputString = aScanner.next();
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println(e.getMessage());
                aScanner.next();
            }
            if ((inputString.length() == 1 && !charFlag) || !inputString.matches("[a-zA-Z]*")) {
                System.out.println("Please enter regular character(s) only.");
                condition = false;
            }
            else {
                condition = true;
            }
        } while (!condition);
        return inputString;
    }
    public static int[] getDigit(int passedNumber) {
        Scanner gDScanner = new Scanner(System.in);
        int theNumber = 0;
        if (passedNumber == 0) {
            theNumber = gDScanner.nextInt();
        }
        else {
            theNumber = passedNumber;
        }
        int temp = theNumber;
        int amountofdigits = 0;
        while (temp != 0) { // Get amount of digits
            temp = temp / 10;
            ++amountofdigits;
        }
        int[] theDigits = new int[amountofdigits]; // Make a new array
        int sumOfDigits = 0;
        for (int i = 0;theNumber != 0; i++) {
            sumOfDigits =+ theNumber % 10;
            theDigits[i] = sumOfDigits;
            theNumber = theNumber / 10;
        }
        return theDigits;
    }
    public static int[] getDigit() {
        return getDigit(0);
    }
    public static boolean isPrime(int primeNumber) {
        boolean isNumberAPrime = true;
        for(int i = 2; i <= primeNumber/2; i++) { // 4/2 = 2
            if (primeNumber % i == 0) {
                isNumberAPrime = false;
                break;
            }
            else if (primeNumber % i != 0) {
                continue;
            }
        }
        return isNumberAPrime;
    }
    public static int getNumberOfDigit(int theNumber) {
        int temp = theNumber;
        int amountofdigits = 0;
        while (temp != 0) { // Get amount of digits
            temp = temp / 10;
            ++amountofdigits;
        }
        return amountofdigits;
    }
    // I copy and pasted your code from the email but I ended up deleting a lot of things and changing them.
}
