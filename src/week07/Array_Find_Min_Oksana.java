package week07;

import java.util.Arrays;

public class Array_Find_Min_Oksana {

    public static void main(String[] args) {

        System.out.println(MinNumber(new int[]{101, 52, 5}));


    }

    public static int MinNumber (int [] arr) {
        int min = arr[0];
        for (int i = 0; i< arr.length; i++)
            if (min>arr[i]) {
               min = arr[i];
            }
        return min;
    }
}
