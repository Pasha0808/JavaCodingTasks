package week04;

import java.util.*;

public class week4_Pavlo {
    /*
    String -- Frequency of Characters
    Write a return method that can find the frequency of
    characters
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static String FrequencyChar(String str){
        String freq ="";
        ArrayList<String> letters = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each: letters) {
            if(!(freq.contains(each))) {
                freq += (each + Collections.frequency(letters, each));
            }
        }
      return freq;
    }
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
    public static Boolean sameLetters(String str1, String str2){
        return (Arrays.asList(str1.split(""))).containsAll(Arrays.asList(str2.split("")));
    }


    /*
    String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static void duplicatesRemove(String str) {

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(str.split("")));
        HashSet<String> dup = new HashSet<>(letters);
        for (String each : dup) {
            System.out.print(each);
        }


    }
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

        System.out.println("Enter letters:");
       String letters = scan.nextLine();
       System.out.println("Frequency of letters: " + FrequencyChar(letters));
        System.out.println("________________________________________________");

        System.out.println("Enter 2 sets of letters:");
        System.out.println("Same Letters: " + sameLetters(scan.nextLine(), scan.nextLine()));
        System.out.println("________________________________________________");


        System.out.println("Enter letters:");
        String letters2 = scan.nextLine();
        duplicatesRemove(letters2);

        }
    }

