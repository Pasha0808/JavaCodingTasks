package week_07;

public class Array_Find_Minimum {

    public static void main(String[] args) {

      int[] arr={2,-5,6789,6,8,};

        System.out.println(minMun(arr));

    }




    public static int minMun(int[]arr){

       int min=arr [0];
        for (int each:arr
             ) {

            if(each <min){
                min=each;
            }

        }

      return min;
    }
}
