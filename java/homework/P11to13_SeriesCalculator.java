package homework;

public class P11to13_SeriesCalculator {
    public static void main(String[] args) {
        System.out.println("The first series is 2 5 10 17 26 37, how many terms do you want it to go?");
        int firstNumOfTerms = Util.readValidNumber();
        evaluateFirstSeries(firstNumOfTerms);
        System.out.println("The second series is 2 6 12 20 30 42 56, how many terms do you want it to go?");
        int secondNumOfTerms = Util.readValidNumber();
        evaluateSecondSeries(secondNumOfTerms);
        System.out.println("The second series is 3 6 12 24 48 96, how many terms do you want it to go?");
        int thirdNumOfTerms = Util.readValidNumber();
        evaluateThirdSeries(thirdNumOfTerms);
        System.out.println("Thanks for using my program.");
    }
    public static void evaluateFirstSeries(int theNumOfTerms) {
        int firstNumber = 2;
        for (int i = 1; i <= theNumOfTerms; i++) {
            int otherTerms = i*i + 1;
            System.out.print(otherTerms + " ");
        }
         /* int theNumberToAddTo = 3;
         int otherTerms = 2;
         System.out.println(firstNumber);
        theNumOfTerms = theNumOfTerms - 1;
        while (theNumOfTerms != 0) {
            otherTerms = otherTerms + theNumberToAddTo;
            System.out.println(otherTerms);
            theNumberToAddTo = theNumberToAddTo + 2;
            theNumOfTerms--;
        } */
        System.out.println("");
    }
    public static void evaluateSecondSeries(int theNumOfTerms) {
        int firstNumber = 2;
        for (int i = 1; i <= theNumOfTerms; i++) {
            int otherTerms = i*i + i;
            System.out.print(otherTerms + " ");
        }
        /* int otherTerms = 2;
        int theNumberToAddTo = 4;
        System.out.println(firstNumber);
        theNumOfTerms = theNumOfTerms - 1;
        while (theNumOfTerms != 0) {
            otherTerms = otherTerms + theNumberToAddTo;
            System.out.println(otherTerms);
            theNumberToAddTo = theNumberToAddTo + 2;
            theNumOfTerms--;
        } */
        System.out.println("");
    }
    public static void evaluateThirdSeries(int theNumOfTerms) {
        int firstNumber = 3;
        for (int i = 1; i <= theNumOfTerms; i++) {
            System.out.print(firstNumber + " ");
            firstNumber = firstNumber * 2;
        }
        /* int firstNumber = 3;
        System.out.print(firstNumber + " ");
        theNumOfTerms = theNumOfTerms - 1;
        while (theNumOfTerms != 0) {
            firstNumber = firstNumber * 2;
            System.out.print(firstNumber + " ");
            theNumOfTerms--;
        } */
    }
}
