package homework;

public class P27_CycloNumber {
    public static void main(String[] args) {
        System.out.println("Enter your number to see if it is a cyclo number.");
        int numberToBeTested = Util.readValidNumber();
        String stringToBeTested = Integer.toString(numberToBeTested);
        isCycloNumber(stringToBeTested);
    }
    public static boolean isCycloNumber(String convertedString) { // make it unit test able
        if (convertedString.charAt(0) == convertedString.charAt(convertedString.length() - 1)) {
            System.out.println("Your number is a cyclo number.");
            return true;
        }
        else {
            System.out.println("Sorry, your number is not a cyclo number.");
            return false;
        }
    }
}

