package week01;
import java.util.*;
public class pavloTasks_week01 {
    public static void oddEven(int x){
        if(x%2==0){
            System.out.println("Even");}
        else System.out.println("Odd");
    }

    public static void divide (int x, int y) {
        int num =x;
        int count =0;

        for (int i= x; num>=y; i++ ){
            num=num-y;
            count++;
        }
        System.out.println("Number "+x+" divided by "+y+ " = "+count+" with a remainder of "+x%y);

        /*better to do it with a while loop

        int count = 0;

        while(x>=y){
        x=x-y;
        count++

        }
        */
    }

    public static void multiple (int x, int y){


        for (int i = x; i<=y; i++){
            if (i%3==0&&i%5==0)
            {
                System.out.println("FINRA");
            }
            else if (i%3==0)
            {
                System.out.println("FIN");
            }
            else if (i%5==0)
            {
                System.out.println("RA");
            }
            else
                System.out.println(i);
        }

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter an integer number to see if its even or odd");
        int number = scan.nextInt();
        oddEven(number);

        System.out.println("_____________________________________________________");

        /*
        System.out.println("Enter 2 numbers");
        int x = scan.nextInt();
        int y = scan.nextInt();
        divide(x,y);

        System.out.println("_____________________________________________________");
        */

       /* System.out.println("Enter 2 numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        multiple(a,b);

        */
    }

}


