package week01;

public class Numbers_Print_Consecutive_numbers {


    public static void main(String[] args) {
        consecutiveNumbers(16);
    }
    public static void consecutiveNumbers(int n){



        for (int i = 0; i <=n ; i++) {
String result="";

if(i%2==0){
    result+="Codility";
}

if (i%3==0){
    result+="Test";
}

if(i%5==0){
    result+="Coders";
}
            System.out.println(result.isEmpty()? i : result);

//new change
        }


    }



}