package homework;

public class P14to16Series {
    public static void main(String [] args) {
        System.out.println("Enter x");
        float thenumber = Util.readValidNumber();
        System.out.println("The first series is: ");
        calculatingFirstSeries(thenumber);
        System.out.println("\nPrinting second series....");
        calculatingSecondSeries();
        System.out.println("\nHow many terms for the third series?");
        int numberOfTerms = Util.readValidNumber();
        calculatingThirdSeries(numberOfTerms);
    }
    public static void calculatingFirstSeries(float x) {
        int divideBy = 3;
        for (int i = 0; i < 9; i++) {
            float x2 = x / divideBy; // 4.8 / 7 = 0.8
            x = x + x2; // 4.8 + 0.685714286
            System.out.print(x + " "); // print 4.8
            divideBy = divideBy + 2; // divideby = 5 = 5 + 2 which is 7
        }
    }
    public static void calculatingSecondSeries() {
        double denominator = 2;
        double numerator = 1;
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + (numerator / denominator);
            numerator++;
            denominator++;
            System.out.print(sum + ", " + numerator + ", " + denominator);
        }
    }
    public static void calculatingThirdSeries(float numOfTerms) {
        double sum = 0;
        for (int i = 0; i < numOfTerms; i++) { // 1
            sum = sum + Math.pow(2, i);
        }
        System.out.println((int)sum);
    }


}
