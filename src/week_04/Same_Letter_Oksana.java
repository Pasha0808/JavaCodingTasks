package week_04;

import java.util.Arrays;

public class Same_Letter_Oksana {
    //String -- Same letters
    //Write a return method that check if a string is build out of the
    //same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:

    public static void main(String[] args) {
        System.out.println(SameString("adghjk","lkjhnb"));
    }


    public static Boolean SameString (String str, String str2) {
       return (Arrays.asList(str.split("")).containsAll(Arrays.asList(str2.split(""))));
        }
    }


