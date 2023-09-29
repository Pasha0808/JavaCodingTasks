package week02;

public class DivisibleBy3_5_15 {
    /*
    Write a program that can print the numbers between 1~ 100 that can be divisible by 3,5,15

if the number can be divisible by 3,5, and 15 then it should be displayed in DivisibleBy15 section

if the number can be divisible by 3 and can not be divisible by 15 then it should only be displayed in DivisibleBy3 section

if the number can be divisible by 5 and can not be divisible by 15 then it should only be displayed in DivisibleBy5 section

output:

divisible by15: 15,30,45,60,75,90
     */

    public static void divisibleBy3_5or15(){
            String divisibleBy15="divisible by15:", divisibleBy3="divisible by3:",divisibleBy5="divisible by5:";

        for (int i = 1; i <= 100; i++) {

            if(i%3==0&& i % 5==0 && i % 15 == 00){

                divisibleBy15+=i+", ";
                continue;
            }

            if(i % 3==0 && i % 15 !=0){
                divisibleBy3 +=i+", ";
                continue;
            }

            if(i % 5==0 && i % 15 !=0){
                divisibleBy5 +=i+", ";
            }




        }



        System.out.println(divisibleBy15);
        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);



    }

    public static void main(String[] args) {
        divisibleBy3_5or15();
    }


}
