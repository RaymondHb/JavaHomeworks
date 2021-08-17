package homework;

import java.util.ArrayList;

public class P26_LeadNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to see if it is a lead number.");
        int testedNumber = Util.readValidNumber();
        if (isLeadNumber(testedNumber)) System.out.println("Your number is a lead number.");
        else System.out.println("Sorry, your number is not a lead number.");
    }
    public static boolean isLeadNumber(int numberToBeTested) {
        int sumOfOdd = 0;
        int sumOfEven = 0;
        for (; numberToBeTested > 0;) { // 1452
            int currentDigit = numberToBeTested % 10;
            if (currentDigit % 2 == 0) { // 2
                sumOfEven += currentDigit;
            }
            else {
                sumOfOdd += currentDigit;
            }
            numberToBeTested = numberToBeTested / 10;
        }
        if (sumOfEven == sumOfOdd) return true;
        else return false;

    }
}
