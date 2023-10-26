package week03;

public class ReverseNegativeNumber_Zhd {
    /*
    2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */
    public static void main(String[] args) {
        reverseNum(-23);
    }
    public static int reverseNum(int num) {

        if (num > 0) {
            System.out.println(num +" is number positive");;


        } else if (num < 0) {
            num = num * (-1);
            System.out.println(num + " is number negative");
        }
   return num;

    }
}