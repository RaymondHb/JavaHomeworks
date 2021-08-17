package homework;

public class P17to18_PrimeAndCompositeNumber {
    public static void main(String [] args) {
        System.out.println("Check a number to see whether it is a prime number or not.");
        int theNumber = Util.readValidNumber();
        if (checkPrimeNumber(theNumber)) {
            System.out.println("Sorry, your number is not a prime number.");
        }
        else {
            System.out.println("Congratulations, your number is a prime number!.");
        }
    }
    public static boolean checkPrimeNumber(int theNumber) { // 4
        boolean isNumberAFactor = false;
        for(int i = 2; i <= theNumber/2; i++) { // 4/2 = 2
            if (theNumber % i == 0) {
                isNumberAFactor = true;
                break;
            }
            else if (theNumber % i != 0) {
                continue;
            }
        }
        return isNumberAFactor;
    }
    // PROGRAM WORKS AT FIRST TRY :)!!!!1!!!!!
    // 4 doesn't work because I'm starting the count as 2 because I know 1 is one of the factors of a prime number
    // and my condition states that do the loop as long as half of the number (4) which is 2 is not i and
    // I start my loop initiating i with 2.
}
