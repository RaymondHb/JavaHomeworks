package homework;
import java.lang.Math;

public class P24_TwinPrime {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to see whether they are twin primes or not.");
        int firstPrime = Util.readValidNumber();
        int secondPrime = Util.readValidNumber();
        if (areTwinPrime(firstPrime, secondPrime)) System.out.println("Your numbers are twin prime numbers.");
        else System.out.println("Your numbers are not twin prime numbers.");
    }
    public static boolean areTwinPrime(int firstPrime, int secondPrime) {
        boolean isPrime = false;
        if (Math.abs(firstPrime - secondPrime) == 2) {
            if (Util.isPrime(firstPrime)) {
                if (Util.isPrime(secondPrime)) isPrime = true;
                else isPrime = false;
            }
            else if (Util.isPrime(secondPrime)) {
                if (Util.isPrime(firstPrime)) isPrime = true;
                else isPrime = false;
            }
        }
        else {
            isPrime = false;
        }
        return isPrime;
    }
}
