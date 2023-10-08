package week_03;

public class Prime_Number_Oksana {

    //1. Numbers -- Prime Number
    //Write a method that can check if a number is
    //prime or not

    //A prime number is a whole number greater than 1 whose only factors are 1 and itself.
    // A factor is a whole number that can be divided evenly into another number.
    // The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
    // Numbers that have more than two factors are called composite numbers.

    public static void main(String[] args) {
        int number = 16;

                   if (number%2==0&&number%3==0) {
                System.out.println("number " + number + " is  not prime number");
                         } else if (number%1== 0 || number % number == 0)
            {
                System.out.println("number " + number + " is prime number");

            }
        }
    }
