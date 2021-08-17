package homework;

public class P28_TwistNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if your number is a twist number.");
        int[] digitArray = Util.getDigit();
        if (digitArray[0] % 2 == 0 && digitArray[digitArray.length -1 ] % 2 != 0) System.out.println("Your number is a twist number.");
        else System.out.println("Your number is not a twist number.");
    }
}
