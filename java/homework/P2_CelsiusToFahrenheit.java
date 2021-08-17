package homework;

public class P2_CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Enter celsius degrees to convert to fahrenheit");
        int celsiusDegrees = Util.readValidNumber();
        convertCelToFah(celsiusDegrees);
    }
    public static double convertCelToFah(int theDegrees) {
        double theResult = theDegrees * 1.8 + 32;
        System.out.println(theDegrees + " degrees celsius is " + theResult + " degrees fahrenheit.");
        return theResult;
    }
}
