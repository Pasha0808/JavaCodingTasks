package week_02;

public class divisible_by_3_5_15 {

    public static void main(String[] args) {
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <+100 ; i++) {
            if (i%3==0&&i%5==0&&i%15==0){
                divisibleBy15= divisibleBy15 +  i +" ";
            }
            if (i%3==0&&i%15!=0){
                divisibleBy3= divisibleBy3 +  i +" ";
            }
            if (i%5==0&&i%15!=0){
                divisibleBy5= divisibleBy5 +  i +" ";
            }
        }
        System.out.println("divisible by 15: "+divisibleBy15);
        System.out.println("divisible by 5: " +divisibleBy5);
        System.out.println("divisible by 3: "+divisibleBy3);

        //Sunday
    }
}
