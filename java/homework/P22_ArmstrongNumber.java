package homework;

import java.util.ArrayList;

public class P22_ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check whether it is an armstrong number.");
        int theNumber = Util.readValidNumber();
        if (checkArmstrong(theNumber)) System.out.println("Your number is an armstrong number!");
        else System.out.println("Sorry, your number is not an armstrong number. Try again.");
    }
    public static boolean checkArmstrong(int theNumber) {
        int theSum = 0;
        int[] theDigits = Util.getDigit(theNumber); // get digits util function
        for (int i = 0; i < theDigits.length; i++) {
            theSum += (theDigits[i]*theDigits[i]*theDigits[i]); // do the actualy cubing
        }
        if (theSum == theNumber) return true;
        else return false;
    }
}
