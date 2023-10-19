package week03;
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */

import java.util.Scanner;
import java.util.SortedMap;

public class week03_Pavlo {

    public static void primeNumber(int a){
        if(a%2==0){
            System.out.println(a+" - is not a prime number");
        }
        else {
            System.out.println(a+" - is a prime number");
        }
    }


    public static int reverse (int a){
        int b=a*(-1);
     return b;
//simulate
        //another one
        //another

    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        primeNumber(scan.nextInt());
        System.out.println("----------------------------------------------------");


        System.out.println("Enter a negative number to reverse it to a positive:");
        System.out.println(reverse(scan.nextInt()));
    }


}
