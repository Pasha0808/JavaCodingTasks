package week10;

import java.util.Arrays;

public class ArrayAscending {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayAscending(3,4,1,3,8,6,-1,5,1,2,6)));
    }

    public static int[] arrayAscending(int ...array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length-1; j++) {

                if (array[j] > array[j+1]) {

                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }

            }

        }

        return array;

    }

}


