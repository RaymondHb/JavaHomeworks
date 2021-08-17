package homework;

public class P32_ZippoNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check whether it is a zippo number.");
        int[] theNumber = Util.getDigit();
        for (int i = 1; i < theNumber.length -1; i++) {
            if (theNumber[i] == 0) continue;
            else {
                System.out.println("Your number is not a zippo number.");
                System.exit(0);
            }
        }
        System.out.println("Your number is a zippo number.");
        // PROGRAM WORKS AT FIRST TRY YOSS
    }
}
