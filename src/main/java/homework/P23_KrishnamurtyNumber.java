package homework;

public class P23_KrishnamurtyNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check for Krishnamurty number.");
        int passedNumber = Util.readValidNumber();
        if (checkKrishnaMurtyNumber(passedNumber)) System.out.println("Your number is a Krishnamurty number.");
        else System.out.println("Sorry, your number is not a krishnamurty number.");
    }
    public static boolean checkKrishnaMurtyNumber(int theNumber) {
        int[] theDigits = Util.getDigit(theNumber);
        int theSumOfFactorizedDigits = 0;
        for (int i = 0; i < theDigits.length; i++) { // 134
            theSumOfFactorizedDigits += factorialOfNumber(theDigits[i]);
        }
        if (theSumOfFactorizedDigits == theNumber) return true;
        else return false;
    }
    static int factorialOfNumber(int n) {
        if (n == 0) return 1; // Factorial is basically just the number of times you can arrange a number, there's only one way to arrange 0.
        return n*factorialOfNumber(n-1); // I took this snippet of code from google because I didn't
        // really understand it that much, but now I know why it works
    }
}
