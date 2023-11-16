package week03;

public class PrimeNumberNp {

//write a method that can check if the method is prime or not
public static void main(String[] args) {
    System.out.println("isPrime(4) = " + isPrime(4));
    System.out.println("isPrime(7) = " + isPrime(7));
    System.out.println("isPrime(3) = " + isPrime(3));
    System.out.println("isPrime(6) = " + isPrime(6));
}

public static boolean isPrime(int n){

    for (int i = 2; i < n; i++) {

        if(n%2==0){
            return false;
        }

    }



   return true;
}





}
