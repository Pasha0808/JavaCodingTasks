package week02;

public class ConsecutiveNumbersZTE {
    public static void main(String[] args) {




         for (int i=1;i<=24;i++){

            if (i%2==0 && i%3==0 &&i%5==0) {
                System.out.println("CodilityTestCoders");

            } else if (i%2==0 && i%5==0) {
                System.out.println("CodilityCoders");

            }else if (i%2==0 && i%3==0){
                System.out.println("CodilityTest");

            }else if (i%2==0){
                System.out.println("Codility");

            }else if (i%3==0){
                System.out.println("Test");

            } else if (i%5==0) {
                System.out.println("Coders");

            }else {
                System.out.println(i);
            }
        }

    }
}
