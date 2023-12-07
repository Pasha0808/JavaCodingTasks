package week10;

//import jdk.internal.jimage.ImageStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.



ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.


Map - Sort the map by values
Write a method that can sort the Map by values.
 */
public class week_10_Pavlo {
    public static void ascending (ArrayList<Integer> num1){


        for (int i = 0; i <num1.size() ; i++) {
            for (int j = 0; j < num1.size() - 1; j++) {
                if (num1.get(j) > num1.get(j + 1)) {
                    int bigger = num1.get(j);
                    num1.set(j, num1.get(j + 1));
                    num1.set(j + 1, bigger);
                }
            }
        }
        System.out.println(num1);
    }

    public static void descending (ArrayList<Integer> num1){


        for (int i = 0; i <num1.size() ; i++) {
            for (int j = 0; j < num1.size() - 1; j++) {
                if (num1.get(j) < num1.get(j + 1)) {
                    int bigger = num1.get(j);
                    num1.set(j, num1.get(j + 1));
                    num1.set(j + 1, bigger);
                }
            }
        }
        System.out.println(num1);
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(scan.nextInt());
        nums.add(scan.nextInt());
        nums.add(scan.nextInt());
        nums.add(scan.nextInt());
        nums.add(scan.nextInt());


      ascending(nums);

      descending(nums);




    }






}
