package homework;

public class P29_MicroNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check whether it has a micro number.");
        int numberToBeTested = Util.readValidNumber();
        isMicroNumber(numberToBeTested);
    }
    public static boolean isMicroNumber(int numberToBeTested) {
        int[] arrayToBeTest = Util.getDigit(numberToBeTested);
        boolean isMicro = false;
        for (int i = 0; i < arrayToBeTest.length; i++) {
            if (arrayToBeTest[i] % 2 == 0) {
                System.out.println("Your number is a micro number.");
                return isMicro = true;
            }
            else {
                continue;
            }
        }
        if (isMicro = false) System.out.println("Not a micro number.");
        return isMicro;
    }
}
