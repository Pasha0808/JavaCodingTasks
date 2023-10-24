package week_05;

public class String_Find_Unique_Oksana {
    //String -- Find the unique
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static void main(String[] args) {
        System.out.println(uniqueLetter("ooollkkmmnnh"));
    }

    public static String uniqueLetter(String str) {

        String Unique = "";

        for (int i = 0; i < str.length() - 1; i++) {
            char each = str.charAt(i);
            //  char uniqueChar;
            if (Unique.contains(each + "")) {
                continue;
            } else {
                Unique += (each + "");
            }



        }
        return Unique;
    }

}

