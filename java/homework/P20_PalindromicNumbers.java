package homework;

public class P20_PalindromicNumbers {
   public static void main(String[] args) {
       System.out.println("Please enter the number of digits of the palindrome.");
       int theNumber = Util.readValidNumber();
       int[] theArray = new int[theNumber]; // I don't currently have a feasible way to convert integer input to array.
       System.out.println("Now please type the digits of the palindrome.");
       for (int i = 0; i < theNumber; i++) {
           theArray[i] = Util.readValidNumber(); // Assigning array
       }
       if (checkPalindrome(theArray)) {
           System.out.println("Your number is a palindrome!");
       }
       else {
           System.out.println("Sorry, your number is not a palindrome.");
       }
   }
   public static boolean checkPalindrome(int[] theArray) {
       boolean isAPalindrome = true;
       for (int i = 0, j = theArray.length - 1; i < j; i++, j--) {
           if (theArray[i] == theArray[j]) {
               continue;
           }
           else {
               isAPalindrome = false;
           }
       }
       return isAPalindrome;
   }
}
