package week01;

public class DivisibleByNP {

    public static void main(String[] args) {

//divisible by 3

        for (int i = 1; i < 100; i++) {
            if(i%3==0){
                System.out.println("Divisible by 3 = " + i + ",");
            }
        }

//divisible by 5


        for (int i = 1; i <100 ; i++) {
            if(i%5==0){
                System.out.println("Divisible by 5 = " + i + ",");
            }

        }

//number divisible by 15

        for (int i = 1; i <100 ; i++) {
            if(i%15==0){
                System.out.println("Divisible by 15 = " +i+",");
            }
        }







    }
}
