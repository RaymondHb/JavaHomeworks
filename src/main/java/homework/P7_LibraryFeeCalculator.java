package homework;

public class P7_LibraryFeeCalculator {
    public static void main(String[] args) {
        System.out.println("Please tell me how many days you are late. ");
        int numDays = Util.readValidNumber();
        System.out.println("Your late fine is: " + feeCalculator(numDays) + " rupees.");
    }
    public static int feeCalculator(int theNumOfDays) {
        int fine = 0;
        if (theNumOfDays <= 3) {
            fine = 4 * theNumOfDays;
        }
        else if (theNumOfDays > 3 && theNumOfDays <= 7) {
            fine = 8 * theNumOfDays;
        }
        else if (theNumOfDays > 8 && theNumOfDays <= 15) {
            fine = 12 * theNumOfDays;
        }
        else if (theNumOfDays > 15) {
            fine = 20 * theNumOfDays;
        }
        else {
            System.out.println("There seems to be something wrong, try again using different value.");
        }
        return fine;
    }
}
