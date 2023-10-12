package week_03;

public class Reverse_negative_number_Oksana {

       //2. Numbers -- Reverse negative number
    //Write a return method that can reverse
    //negative number and return it as int

    public static void main(String[] args) {
        int num = -63;
        int positiveNumber = num*-1;

        int reverseNumberFirstDigit = positiveNumber%10;
     //   System.out.println(reverseNumberFirstDigit);
        int reverseNumberSecondDigit = positiveNumber/10;
    //    System.out.println(reverseNumberSecondDigit);
        int reverseNumber = (reverseNumberFirstDigit*10)+reverseNumberSecondDigit;
        int reverseNegativeNumber = ((reverseNumberFirstDigit*10)+reverseNumberSecondDigit)*-1;
        System.out.println("negative number is : "+num+ "  reverse number is " + reverseNumber+ " reverse negative number : "+reverseNegativeNumber);


    }


}
