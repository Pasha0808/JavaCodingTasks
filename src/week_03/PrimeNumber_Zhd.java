package week_03;

public class PrimeNumber_Zhd {
    /*
    1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
     */

    public static void main(String[] args) {

        int num = 29;
        boolean notPrime = false;

        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                notPrime = true;
                break;
            }
        }

        if (!notPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}