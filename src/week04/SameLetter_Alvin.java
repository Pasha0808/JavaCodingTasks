package week04;

import java.util.Arrays;

public class SameLetter_Alvin {


    public static void main(String[] args) {
        String a= "alb";
        String b = "abl";
        boolean same = same(a, b);
        System.out.println("same = " + same);


    }

    public static boolean same(String a, String b) {
        char[] ch1 = a.toCharArray(); //[a,l,b]
        char[]  ch2 = b.toCharArray(); //[a,b,l]
        Arrays.sort(ch1);// [a,b,l]
        Arrays.sort(ch2);// [a,b,l]

        String a1="", a2="";
        for(char each: ch1)
            a1 +=each;

        for(char each: ch2)
            a2 +=each;

        return  a1.equals(a2) ;
    }

}
