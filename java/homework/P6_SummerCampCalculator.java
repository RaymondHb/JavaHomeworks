package homework;

public class P6_SummerCampCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter the age of your kids (only two kids allowed out of 4 family members): ");
        int A = Util.readValidNumber();
        System.out.println("Please enter the older sibling's age: ");
        int B = Util.readValidNumber();
        int G = A;
        if (bonusOrNot(G))
            System.out.println("Hey, you and your brother get a free lunch!");
        else
            System.out.println("You and your brother will get a nice English meal snack packet.");
    }
    public static boolean bonusOrNot(int g) {
        if (g < 13) {
            return true;
        }
        else {
           return false;
        }
    }
}
