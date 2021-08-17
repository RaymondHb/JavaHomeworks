package homework;

public class P8_PasswordNumberMaker {
    public static void main(String[] args) {
        System.out.println("Please enter a number to be checked whether it is an extraordinary number or not. (full numbers)");
        int numberToBeChecked = Util.readValidNumber(true);
        do {
            if (isExtraOrdinaryNumber(numberToBeChecked))
                System.out.println("Your number is an extraordinary number.");
            else
                System.out.println("Sorry, your number is not an extraordinary number.");

            System.out.println("Enter a new number or -1 to exit the program.");
            numberToBeChecked = Util.readValidNumber(true);

        } while (numberToBeChecked != -1);

        System.out.println("Thank you for using the program");
    }

    public static boolean isExtraOrdinaryNumber(int theNum) {
        boolean extraOrdNumberOrNot = false;
        if (theNum == 0) {
            System.out.println("Sorry, 0 is not a valid number, please try again: ");
        } else if ((theNum % 12 == 0 || theNum % 8 == 0) & theNum % 6 != 0) {
            extraOrdNumberOrNot = true;
        }
        return extraOrdNumberOrNot;
    }
}
