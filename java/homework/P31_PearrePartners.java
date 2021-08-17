package homework;

public class P31_PearrePartners {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to see if they are pearre partners.");
        int[] firstNumber = Util.getDigit();
        int[] secondNumber = Util.getDigit();
        if (firstNumber[0] == secondNumber[secondNumber.length -1] && firstNumber[firstNumber.length -1 ] == secondNumber[0]) {
            System.out.println("Your pair of numbers are pearre partners.");
        }
        else System.out.println("Sorry, your numbers are not pearre partners.");
    }
}
