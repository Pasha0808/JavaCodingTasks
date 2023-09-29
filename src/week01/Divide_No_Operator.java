package week01;

public class Divide_No_Operator {
    public static void divide_No_operator(int top, int bottom){//top =11
        int remainder=top%bottom; //2
        int sum = 0;
        int count = 0;
        int ceiling = top - remainder;//9

        if(bottom ==0){
            System.err.println("denominator can't be zero");
            return;
        }
        if( bottom>top){
            System.err.println("error: bottom > top");
            return;
        }
        while (sum < ceiling){

            count++;

            sum+= bottom;

        }
        System.out.println(top+ " divided by "+ bottom+" is "+ count +" with a remainder of "+ remainder );
    }

    public static void main(String[] args) {
        divide_No_operator(16,16);
    }

}


