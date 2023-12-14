package week_11;


import java.util.*;

public class week_11_Pavlo {


    public static int min (Map<String, Integer> num1){

        Integer min = num1.get("A");

        for (Map.Entry<String, Integer> each : num1.entrySet())
        {

            if (min>each.getValue()){
                min=each.getValue();
            }
        }
        return min;
        }




        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        Map<String, Integer> nums = new LinkedHashMap<>();

        nums.put("A", new Integer(scan.nextInt()));
        nums.put("B", new Integer(scan.nextInt()));
        nums.put("C", new Integer(scan.nextInt()));
        nums.put("D", new Integer(scan.nextInt()));
        nums.put("E", new Integer(scan.nextInt()));



        System.out.println("Minimum number is: "+min(nums));




    }
}
