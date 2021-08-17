package homework;
public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println("This is a program to calculatE sum of series, enter a and n which," +
                " for example, can correspond to 1 which is a and over 2 which is n, 1/2.");
        int aNumber = Util.readValidNumber(); // 3
        int nNumber = Util.readValidNumber(); // 4
        calculateSumOfSeries(aNumber, nNumber);
    }
    public static double calculateSumOfSeries(int firstNumber, int secondNumber) {
        double theSum = 0;
        for (int i = 1; i <= secondNumber; i++) {
            double theSeries = i / Math.pow(firstNumber, i);
            theSum = theSum + theSeries;
        }
        System.out.println("The sum of your series is: " + theSum);
        return theSum;
    }
}
