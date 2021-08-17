package homework;

import java.util.Calendar;

public class P5_ConvertSecondsToMinute {
    public static void main(String[] args) { // My method
        System.out.println("Please enter the number of seconds you want, to convert to minutes.");
        int numberOfSec = Util.readValidNumber();
        convertingSecToMin(numberOfSec);
        figureMinutesEasier(numberOfSec);
    }
    public static int convertingSecToMin(int theSeconds) {
        System.out.println("Time is: " + Calendar.getInstance());
        if (theSeconds < 60) {
            System.out.println("No minute to convert here, " + theSeconds + ", is shorter than a minute, which is 60 seconds.");
        }
        int counter = 0;
        int originalSec = theSeconds; // Just to show original seconds
        while (theSeconds > 60) {
            theSeconds = theSeconds - 60;
            counter = counter + 1;
            if (theSeconds == 60) {
                counter = counter + 1;
                theSeconds = theSeconds - 60;
            }
        }
        System.out.println(originalSec + " is " + counter + " minutes and " + theSeconds + " seconds.");
        System.out.println("Time is: " + Calendar.getInstance());
        return counter;
    }
    public static MinutesAndSeconds figureMinutesEasier(int theSeconds) { // Finding out after googling how to convert seconds to minutes after I wrote my code above
        System.out.println("Time is: " + Calendar.getInstance());
        MinutesAndSeconds theReturnValue = new MinutesAndSeconds(theSeconds / 60, theSeconds % 60);
        System.out.println(theReturnValue);
        System.out.println("Time is: " + Calendar.getInstance());
        return theReturnValue;
    }
}
