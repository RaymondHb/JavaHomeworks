package homework;

public class P27_CycloNumber {
    public static void main(String[] args) {
        System.out.println("Enter your number to see if it is a cyclo number.");
        int numberToBeTested = Util.readValidNumber();
        String stringToBeTested = Integer.toString(numberToBeTested);
        if (stringToBeTested.charAt(0) == stringToBeTested.charAt(stringToBeTested.length() - 1)) System.out.println("Your number is a cyclo number.");
        else System.out.println("Sorry, your number is not a cyclo number.");
    }
}

