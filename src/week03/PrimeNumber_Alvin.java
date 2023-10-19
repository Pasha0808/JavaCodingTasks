package week03;

public class PrimeNumber_Alvin {
    public static void main(String[] args) {
        boolean b = primeNumber(15);
        System.out.println("b = " + b);
    }
    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;

    }

}
