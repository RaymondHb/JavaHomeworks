package homework;
import java.util.*;
public class SumOfPower {
    public static void main(String[] args) {
        System.out.println("Please enter a number.");
        int userInput = Util.readValidNumber();
        System.out.println("The sum of powers is: " + calculateSumOfPowers(userInput));
    }
    public static double calculateSumOfPowers(int userInputNumber) {
        int originalInput = userInputNumber;
        int currentDigit = 0;
        int userInputLength = 0;
         /* for (; userInputNumber > 0; userInputLength++) {
            currentDigit = userInputNumber % 10;
            userInputNumber = userInputNumber /10;
        } */
        userInputLength = (String.valueOf(userInputNumber)).length();
        System.out.println(userInputLength);
        double power = 0;
        double sumOfPowers = 0;
        userInputNumber = originalInput;
        for (; userInputNumber > 0;) {
            // sumOfPowers = 0, 64, 73, power = 0, 64, 9
            currentDigit = userInputNumber % 10;
            // currentDigit = 4, 3, 2
            userInputNumber = userInputNumber /10;
            // userInputNumber = 234, 23, 2, 0
            power = Math.pow(currentDigit, userInputLength);
            userInputLength = userInputLength - 1;
            // power = 2 ^ 1 = 2
            sumOfPowers = sumOfPowers + power;
            // sumOfPowers = 73 + 2 = 75
        }
        return sumOfPowers;
    }
}
