package week02;

public class SwapingNumbersZTE {
    public static void main(String[] args) {

        /*
        number         swapping number
        a=10             a=5;
        b=5              b=10;
         */

        int a = 10;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
