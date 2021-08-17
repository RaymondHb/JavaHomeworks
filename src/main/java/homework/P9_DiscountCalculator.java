package homework;

public class P9_DiscountCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter your total amount of money for the purchase.");
        double thePrice = Util.readValidNumber(false);
        System.out.println("Now please enter the number of books you purchased.");
        int numOfBooks = Util.readValidNumber(false);
        System.out.println("Amount payable is: " + calculateDiscountedPrice(thePrice, numOfBooks) + " Rupees.");
        System.out.println("Thanks for using the program.");
    }
    public static double calculateDiscountedPrice(double priceOfBooks, int numOfBooks) {
        double discount = 0;
        if (numOfBooks >= 100) {
            discount = priceOfBooks * 50 / 100;
            System.out.println("You get 50% discount.");
        }
        else if (numOfBooks < 100 && numOfBooks >= 50) {
            discount = priceOfBooks * 25 / 100;
            System.out.println("You get 25% discount.");
        }
        else if (numOfBooks < 50 && numOfBooks >= 10) {
            discount = priceOfBooks * 10 / 100;
            System.out.println("You get 10% discount.");
        }
        else {
            discount = priceOfBooks * 4 / 100;
            System.out.println("You get 4% discount.");
        }
        return (priceOfBooks - discount);
    }
}
