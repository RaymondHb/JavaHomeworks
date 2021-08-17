package homework;
import java.util.*;
public class PerfectNumbers {
    public static void main(String[]args) {
        int theSumOfFactors = 0;
        int userNumber = 0;
        do {
            System.out.println("Enter a number which you would like to see whether it is a perfect number or not.");
            userNumber = Util.readValidNumber();

            if(isPerfectNumber(userNumber))
                System.out.println("It is a Perfect Number");
            else
                System.out.println("It is NOT a Perfect Number");

        } while(userNumber >= 0);
    }

    public static boolean isPerfectNumber(int userInputNumber) { // 28
        int theSumOfFactors = 0;
        for (int i = 1; i < userInputNumber; i++) { // 10, i is
            if (userInputNumber % i == 0 || (userInputNumber < i/2)) {
                theSumOfFactors = theSumOfFactors + i;
            }
        }
        if (theSumOfFactors == userInputNumber) {
            return true;
        } else {
            return false;
        }
    }
}
