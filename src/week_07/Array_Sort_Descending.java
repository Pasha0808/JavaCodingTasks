package week_07;

import java.util.Arrays;

public class Array_Sort_Descending {



    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDescending(3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6)));
    }

    public static int[] sortDescending(int... arr){

        for(int i = 0; i < arr.length; i++){
            System.out.println("--------- i: " + i);
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] < arr[j + 1]){
                    System.out.println("Swapping " + arr[j] + " and " + arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

                System.out.println("Array after j index of " + j + " | " + Arrays.toString(arr));
            }
        }
        return arr;
    }





}
