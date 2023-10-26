package week05;

public class Reverse_Zhd {
    public static void main(String[] args) {

        String str="aabbddcffdllms";
        String result="";


        for (int i= str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */