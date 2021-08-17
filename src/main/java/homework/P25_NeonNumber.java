package homework;

public class P25_NeonNumber {
    public static void main(String[] args) {
        System.out.println("Enter to check whether your number is a neon number or not.");
        int theNumber = Util.readValidNumber();
        if (checkNeonNumber(theNumber)) System.out.println("Your number is a neon number.");
        else System.out.println("Sorry, your number is not a neon number.");
    }
    public static boolean checkNeonNumber(int theNumber) {
        int squared = theNumber*theNumber;
        if (squared == 0) return true;
        int theSum = 0;
        int[] digitsOfNumber = Util.getDigit(theNumber); // get digits util function
        for (int i = 0; i < digitsOfNumber.length; i++) {
            theSum = theSum + digitsOfNumber[i];
        }
        if (theSum == theNumber) return true;
        else return false;
    }
}
