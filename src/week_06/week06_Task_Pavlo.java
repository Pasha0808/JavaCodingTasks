package week_06;
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false

Array -- Find Maximum
Write a method that can find the maximum number from an int Array

String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class week06_Task_Pavlo {

    public static boolean PasswordValid (String str) {
        boolean pass = true;
        for (int i = 0; i < str.length(); i++) {


        }
        return pass;
    }




public static int FindMAx (String num){
    String[] stringNum = num.split(",");
    int[] num1 = new int[stringNum.length];
    for(int i = 0; i < stringNum.length; i++) {
        num1[i] = Integer.parseInt(stringNum[i]);
    }
    int max =num1[0];
    for (int i = 0; i < num1.length; i++) {
if (max<num1[i]){
    max=num1[i];
}
    }
    return max;
}

public static int SumOfDigits (String num){
        int sum =0;
    ArrayList<String> num1 = new ArrayList<>(Arrays.asList(num.split(",")));
    for (String each: num1) {
        sum+=Integer.parseInt(each);

    }
    return sum;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      System.out.println("Enter numbers:");
      System.out.println("Max number: "+FindMAx(scan.nextLine()));


        System.out.println("Enter numbers:");
        System.out.println("The sum is: "+SumOfDigits(scan.nextLine()));
    }
}
