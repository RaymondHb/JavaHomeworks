package homework;

public class P19_PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number to check whether it is a perfect number.");
        int theNumber = Util.readValidNumber();
        checkPerfectNumber(theNumber);
    }
    public static boolean checkPerfectNumber(int theNumber) {
        int sumOfDivisors = 0;
        boolean perfectNumberOrNot = false;
        for(int i = 1; i < theNumber; i++) {
            if (theNumber % i == 0 || (theNumber < i/2)) {
                sumOfDivisors = sumOfDivisors + i;
            }
        }
        System.out.println(sumOfDivisors);
        if (theNumber == sumOfDivisors) {
            System.out.println("Your number is a perfect number!");
            perfectNumberOrNot = true;
        }
        else {
            System.out.println("Sorry your number is not a perfect number.");
        }
        return perfectNumberOrNot;
    }
}
