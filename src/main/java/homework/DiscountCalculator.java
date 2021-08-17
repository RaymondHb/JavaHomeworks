package homework;

public class DiscountCalculator {
    public static void main(String[] args) {
        System.out.println("Program is running ~~~~");
    }
    public static double calculatePrice(int age, int money) {
        double discountedPrice = 0;
        if (age < 5 || age >= 60) { // for 5% discount
            discountedPrice = money * 5 / 100;
            System.out.println("Discounted price: " + discountedPrice);
        }
        else if (age >= 20 && age <= 35) {
            discountedPrice = money * 1.2 / 100;
            System.out.println("Discounted price: " + discountedPrice);
        }
        else {
            discountedPrice = money * 2.3 / 100;
            System.out.println("Discounted price: " + discountedPrice);
        }
        return discountedPrice;
    }
}
