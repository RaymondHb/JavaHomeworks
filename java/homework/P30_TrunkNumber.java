package homework;

public class P30_TrunkNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number to see whether it is a trunk number.");
        int theNumber = Util.readValidNumber();
        int reverseNumber = 0;
        while (theNumber > 0) {
            reverseNumber =+ reverseNumber * 10 + theNumber % 10; // reverse number x 10 is where the magic happens,
            // I'll explain it to you in class because the explanation is kinda long.
            theNumber = theNumber / 10;
        }
        System.out.println(reverseNumber);
        if (reverseNumber > theNumber) System.out.println("Your number is a trunk number.");
        else System.out.println("Your number is not a trunk number.");
    }
}
