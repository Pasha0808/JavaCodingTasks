package week_06;

public class ArrayFindMaximum {

    public static void main(String[] args) {
        int[]maxNumber={1,344,55,55,5555,555};
        System.out.println(maxNum(maxNumber));

    }




 public static int maxNum(int[]arr){

     int max=arr[0];

     for (int each:arr
          ) {

         if (each>max){
             max=each;
         }


     }
    return max;
 }

}


/*
public static int maxnum(int []arr){

       int max=arr[0];

        for (int each: arr
             ) {
            if(each>max){
                max=each;
            }

        }
return max;
    }
 */