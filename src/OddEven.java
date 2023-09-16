import week01.OddEvenNp;

public class OddEven {

    public static void main(String[] args) {

/*
Number -- odd & even
Write a method which identifies if given number is even or odd
EX:
identify(5) --> "Odd"
identify(6) --> "Even"

*/
       int num= 5;

        boolean isEven = num %2==0;

        boolean isOdd = !isEven;

        System.out.println("isEven = " + isEven);
        System.out.println("isOdd = " + isOdd);



     OddEven(6);

    }

    public static void OddEven(int num){

        String result;

        if (num%2==0){

            result = " num is even";
        }else {

            result ="num is odd";
        }
        System.out.println(result);
    }


}
