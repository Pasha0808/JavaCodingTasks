package week01;

public class ZhdDivideWithoutDivision {
    public static void main(String[] args) {
divideWithoutDivision(9,5);
    }
public static void divideWithoutDivision(int x,int y){
        int count=0;
        while (x>=y){
            x-=y;
            count++;
        }
    System.out.println(count + " remainder "+x%y);
    }
}
/*

Task02:
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator

 */