package week_02;

public class consecutive_numbers {

    public static void main(String[] args) {
        String divisibleByTwo;
        String divisibleByThree;
        String divisibleByFive;
        String divisibleByTwoAndThree ;
        String divisibleByTwoAndFive;
        String divisibleByThreeAndFive;


        for (int i = 1; i <=24 ; i++) {
             if (i%2==0&&i%5==0) {
                divisibleByTwoAndFive="CodilityCoders";
                System.out.println(divisibleByTwoAndFive);
            }else if (i%3==0&&i%5==0 ) {
                divisibleByThreeAndFive= "TestCoders";
                System.out.println(divisibleByThreeAndFive);

            }  else if (i%3==0&&i%2==0 ) {
                divisibleByTwoAndThree= "CodilitTest";
                 System.out.println(divisibleByTwoAndThree);

             } else if (i%2==0) {
                divisibleByTwo=  "Codility";
                System.out.println(divisibleByTwo);
            }else if (i%3==0) {
                divisibleByThree ="Test";
                System.out.println(divisibleByThree);
            }else if (i%5==0) {
                divisibleByFive ="Coders";
                System.out.println(divisibleByFive);
            }else if(i!=2&&i!=3&&i!=5) {
                System.out.println(i);
            }

// Sunday
        }
    }
}
