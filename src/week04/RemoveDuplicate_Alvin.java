package week04;

public class RemoveDuplicate_Alvin {

    public static void main(String[] args) {

        String s = removeDup("AAAABBBCC");
        System.out.println("s = " + s);
    }

    public static  String  removeDup( String  str) {
        String result = "";//ABC
        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))
                //                A       0
                result += "" + str.charAt(i);

        return result;
    }

}
