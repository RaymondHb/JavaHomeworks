package homework;

public class P4_PayCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your basic pay. ");
        float thePay = Util.readValidNumber();
        calculatePay(thePay);
    }
    public static double calculatePay(float thePayAmount) {
        double allowance = thePayAmount * 35 / 100.0;
        double totalAmountPayable = allowance + thePayAmount;
        System.out.println("Your allowance is: " + allowance + ", and you total amount payable is: " + totalAmountPayable + ".");
        return allowance;
    }
}
