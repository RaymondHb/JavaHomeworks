package homework;

public class P21_AmicablePairOfNumbers {
    public static void main (String[] args) {
        System.out.println("Enter number to find out amicable pair for it.");
        int P = Util.readValidNumber();
        findAmicablePair(P);
    }
    public static boolean findAmicablePair(int p) { // p is 220
        // Find matching pair for sum of factors
        boolean isAMatch = false;
        int sumOfFactorsP = findSumOfFactors(p);
        System.out.println(sumOfFactorsP);
        int i = 0;
        for (; i < 600; i++) {
            if (i == sumOfFactorsP) {
                isAMatch = true;
                break;
            }
            else {
                continue;
            }
        }
        int q = i;
        boolean isAmicable = false;
        if (isAMatch) {
            int sumOfFactorsi = findSumOfFactors(q);
            if (sumOfFactorsi == p) {
                System.out.println("Woohoo, you found an amicable pair!");
                isAmicable = true;
            }
            else {
                System.out.println("Sorry, your number doesn't have an amicable pair.");
            }
        }
        else {
            System.out.println("Sorry, your number does not have an amicable pair.");
        }
        return isAmicable;
    }
    public static int findSumOfFactors (int theNumber) {
        // Util method for the class.
        int sumOfFactors = 0;
        for(int i = 1; i < theNumber; i++) {
            if (theNumber % i == 0 || (theNumber < i/2)) {
                sumOfFactors = sumOfFactors + i;
            }
        }
        return sumOfFactors;
    }
}
