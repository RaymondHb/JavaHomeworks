package homework;

public class P28_TwistNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if your number is a twist number.");
        int digitNumber = Util.readValidNumber();
        isTwistNumber(digitNumber);
    }
    public static boolean isTwistNumber(int digitNumber) { // make it unit testable
        int[] digitArr = Util.getDigit(digitNumber);
        if (digitArr[0] % 2 == 0 && digitArr[digitArr.length -1 ] % 2 != 0) {
            System.out.println("Your number is a twist number.");
            return true;
        }
        else {
            System.out.println("Your number is not a twist number.");
            return false;
        }
    }
}
