package week06;

public class Reverse_string {

    public static void main(String[] args) {
        String str = "OKSANA";
        String reverse = "";

        for (int i = str.length()-1; i>=0; i--) {
            char each = str.charAt(i);
            reverse+=each+"";
        }
        System.out.println(reverse);
    }
}
