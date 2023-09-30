package week01;

public class DivideWithoutDivisionNp {

    public static void DivideWithoutOperathor(int x,int y){
        int count=0;

        while (x>=y){
            x=x-y;

            count++;
        }
        System.out.println(count);
    }

}
