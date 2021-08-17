package homework;

public class P33_HistroPair {
    public static void main(String[] args) {
        System.out.println("Enter a pair of numbers to find out their histro pair.");
        int userInput = Util.readValidNumber();
        findHistroPair(userInput);
    }
    public static int findHistroPair(int passedNumber) {
        int sumOfCubesOfOddDigits = 0;
        int currentDigit = 0;
        while (passedNumber!= 0) {
            currentDigit = passedNumber % 10;
            if (currentDigit % 2 != 0) {
                sumOfCubesOfOddDigits += currentDigit*currentDigit*currentDigit;
            }
            passedNumber = passedNumber / 10;
        }
        System.out.println("Histro pair is: " + sumOfCubesOfOddDigits);
        return sumOfCubesOfOddDigits;
    }
}
