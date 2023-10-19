package week04;

public class Frequency_Alvin {

    public static void main(String[] args) {



        String str = "aabcccd";
        String result = "";    //a2b1c3d1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);  // each char from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // to find the frecuency of each charecter

                char each = str.charAt(i);    // each charecter of str
//                  c   == b
                if (ch == each) {

                    count++; //1
                }

            }
            if (result.contains("" + ch)) {
                continue;
            }

            result += ch;
            result += count;

        }
//result "a2b1"

        System.out.println(result);


    }
}
