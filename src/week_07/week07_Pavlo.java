package week_07;
/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array


Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};

Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */

import java.util.Arrays;
import java.util.Scanner;

public class week07_Pavlo {

    public static int FindMin (String num){
        String[] stringNum = num.split(",");
        int[] num1 = new int[stringNum.length];
        for(int i = 0; i < stringNum.length; i++) {
            num1[i] = Integer.valueOf(stringNum[i]);
        }
        int min =num1[0];
        for (int i = 0; i < num1.length; i++) {
            if (min>num1[i]){
                min=num1[i];
            }
        }
        return min;
    }

    public static int[] ascending (String num){
        String[] stringNum = num.split(",");
        int[] num1 = new int[stringNum.length];
        for(int i = 0; i < stringNum.length; i++) {
            num1[i] = Integer.valueOf(stringNum[i]);
        }

        for (int i = 0; i <num1.length ; i++) {
            for (int j = 0; j <num1.length-1 ; j++) {
                if( num1[j]>num1[j+1])
                {
                    int bigger = num1[j];
                    num1[j]= num1[j+1];
                    num1[j+1]= bigger;
                }
            }
        }
        return num1;

    }


    public static int[] descending (String num){
        String[] stringNum = num.split(",");
        int[] num1 = new int[stringNum.length];
        for(int i = 0; i < stringNum.length; i++) {
            num1[i] = Integer.valueOf(stringNum[i]);
        }

        for (int i = 0; i <num1.length ; i++) {
            for (int j = 0; j <num1.length-1 ; j++) {
                if( num1[j]<num1[j+1])
                {
                    int bigger = num1[j];
                    num1[j]= num1[j+1];
                    num1[j+1]= bigger;
                }
            }
        }
        return num1;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter numbers:");
        //System.out.println("Minimum number is: "+FindMin(scan.nextLine()));

        //System.out.println("Ascending order is: "+Arrays.toString(ascending(scan.nextLine())));

        //System.out.println("Descending order is: "+Arrays.toString(descending(scan.nextLine())));


    }
}
