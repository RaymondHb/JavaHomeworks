package homework;

public class P29_MicroNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check whether it has a micro number.");
        int[] numberToBeTested = Util.getDigit();
        for (int i = 0; i < numberToBeTested.length; i++) {
            if (numberToBeTested[i] % 2 == 0) {
                System.out.println("Your number is a micro number.");
                System.exit(0);
            }
            else {
                continue;
            }
        }
        System.out.println("Not a micro number.");
    }
}
