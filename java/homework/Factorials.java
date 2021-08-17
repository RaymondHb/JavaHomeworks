package homework;
/*
 * Purpose: to print the factorial of a number
 * Author: Raymond Habibie
 * Logic:
 * 1. Ask the user for input and use that input in a for loop.
 * 2. Make a for loop that counts down from input to one.
 * 3. In each iteration, you multiply previous product with the current number.
 */
public class Factorials {
    public static void main(String[] args) {
        System.out.println("Enter a number.");
        int firstInput = Util.readValidNumber();
        System.out.println("The factorial of " + firstInput + " is: " + calculateFactorial(firstInput));
    }
    public static int calculateFactorialRecursion(int theInput) {
        if (theInput > 1) {
            return theInput * calculateFactorialRecursion(theInput - 1);
        }
        else {
            return 1;
        }
    }
    public static int calculateFactorial(int theInput) {
        int product = theInput;
        for (int i = --theInput; i > 1; i--) {
            product = product * i;
        } return product;
    }
}
