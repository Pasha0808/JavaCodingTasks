package week_06;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1111));
    }

    public static int sumOfDigits(int n){
       int sum=0;
       while (n!=0){
           sum+=n%10;

           n/=10;
       }

       return sum;
    }


}


