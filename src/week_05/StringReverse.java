package week_05;

public class StringReverse {

    public static void main(String[] args) {


    /*
    String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */
        String str= "ABCD";


        for (int i = str.length()-1; i >= 0 ; i--) {

            String reverse="";

            reverse+=str.charAt(i);


            System.out.println(reverse);

        }




        }






    }

