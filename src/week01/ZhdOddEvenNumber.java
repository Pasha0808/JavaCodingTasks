package week01;

public class ZhdOddEvenNumber {
    public static void main(String[] args) {

        oddEvenNumber(9);


    }

public static  void oddEvenNumber(int num){

        String  result="";
        if (num%2==0){
            result ="EvenNumber";
        }else {
            result="Odd number";
        }
    System.out.println(result);

    }
}
/*
Task01:
Number -- odd & even
Write a method which identifies if given number is even or odd
EX:
identify(5) --> "Odd"
identify(6) --> "Even"



 */