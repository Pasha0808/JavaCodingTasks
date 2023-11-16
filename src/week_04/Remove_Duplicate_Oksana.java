package week_04;

public class Remove_Duplicate_Oksana {
    //String -- Remove Duplicates
    //Write a return method that can remove the duplicated values from
    //String
    //Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {
        System.out.println(removeDuplicate("pppllookkiihb"));
    }

    public static String removeDuplicate(String str) {

      String result = "";
        for (int i = 0; i <=str.length()-1; i++) {
            char  each = str.charAt(i);
           if (result.contains(each+"")) {
               continue;
           }result+=each;

        }
return result;

    }

}
