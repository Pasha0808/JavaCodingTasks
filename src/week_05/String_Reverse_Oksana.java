package week_05;

public class String_Reverse_Oksana {
    //String -- Reverse
    //Write a return method that can reverse String
    //Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {
        System.out.println(reverse("Oksana"));
    }
    public static String reverse (String str) {

        String reverse = "";

        for ( int i = str.length()-1;  i >=0; i--) {
char each = str.charAt(i);
reverse +=each+"";
        }



        return reverse ;
    }


}
