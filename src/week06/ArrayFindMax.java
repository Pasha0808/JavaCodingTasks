package week06;

import java.util.Arrays;

public class ArrayFindMax {
    public static void main(String[] args) {



            int[] num = {1, 2, 12,3, 4, 5, 6};
            int max = Arrays.stream(num).max().getAsInt();

            System.out.println(max);
        }
    }



