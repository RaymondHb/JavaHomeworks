package homework;
import java.util.*;
public class P3_InterchangeValues {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter two values you want to change. (Don't enter characters)");
        String A = myScanner.next(); // I need to use scanner because if I use either readvalidnumber or readvalidstring, then if I say, I use
        // readvalidstring and the user enters a number, it will print an error.
        String B = myScanner.next();
        interchangingValues(A, B); // 11, 12
        System.out.println(A + " is now " + A + ", and " + B + ", is now " + B);
    }
    public static void interchangingValues(String firstValue, String secondValue) {
        String A = firstValue; // This is just to show the original values in sop statement
        String B = secondValue; // ^
        String C = firstValue; // Assign original firstvalue for later
        firstValue = secondValue; // Make it so that first value is equals to second value
        secondValue = C; // Then change the second value so that it is equals to the original first value that we assigned to the temporary variable C in the beginning.
        System.out.println(A + " is now " + firstValue + ", and " + B + ", is now " + secondValue);
    }
}
