package homework;

public class P10_BulkTicketDiscount {
    public static void main(String[] args) {
        System.out.println("Please enter the cost of the ticket you are purchasing.");
        float costOfTicket = Util.readValidNumber();
        System.out.println("Enter how many tickets you want to buy.");
        int numOfTickets = Util.readValidNumber();
        System.out.println("Discounted price is: " + bulkTicketDiscounts(costOfTicket, numOfTickets) + " rupees");
    }
    public static double bulkTicketDiscounts(float ticketPrice, int numOfTickets) {
        float noDiscountAmountPayable = ticketPrice * numOfTickets;
        float discount = 0;
        if (numOfTickets < 50) {
            discount = noDiscountAmountPayable * 5 / 100;
            System.out.println("You get 5% discount");
        }
        else if (numOfTickets < 100 & numOfTickets >= 50) {
            discount = noDiscountAmountPayable * 10 / 100;
            System.out.println("You get 10% discount");
        }
        else if (numOfTickets < 200 & numOfTickets >= 100) {
            discount = noDiscountAmountPayable * 15 / 100;
            System.out.println("You get 15% discount");
        }
        else if (numOfTickets >= 200) {
            discount = noDiscountAmountPayable * 25 / 100;
            System.out.println("You get 25% discount");
        }
        return (noDiscountAmountPayable - discount);
    }
}
