package week05;

import java.util.Scanner;

public class week05_Pavlo {
    /*
    String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";

 */


    public static String uniqueLetter(String str) {

        String Unique = "";

        for (int i = 0; i < str.length() - 1; i++) {
            char each = str.charAt(i);
            if (Unique.contains(each + "")) {
                continue;
            } else {
                Unique += (each + "");
            }
        }
        return Unique;
    }
    public static String unique(String str)
    {
        String characterList ="";

        for (int i=0; i<=str.length()-1;i++ )
     {
         int count=0;
        /*   if(count==1)
            {
             characterList+= str.charAt(i) + "";
             }
         */
         for (int j=0; j<=str.length()-1; j++ ) {
             if ((str.charAt(j) + "").equals((str.charAt(i) + "")))
             {
                 count++;
             }
         }
         if(count==1)
         {
             characterList+= str.charAt(i) + "";
         }
     }
        return characterList;
    }




    /*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
public static String reverse(String str){
    String rev ="";
    for (int i= str.length()-1; i>=0; i--){
        rev+=str.charAt(i);

    }
    return rev;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.println("Enter a list of characters:");

        System.out.println(unique(scan.nextLine()));

        //System.out.println(reverse(scan.nextLine()));

        





    }
}
