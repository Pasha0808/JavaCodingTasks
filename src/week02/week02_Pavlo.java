package week02;


public class week02_Pavlo {


    public static void main(String[] args) {
        int a=10;
        int b=5;

        a = a+b; //15
        b = a-b; //10
        a = a-b; //5
        System.out.println("a = "+a+"\nb = "+ b);


        System.out.println("-----------------------------------------------");


        String By15 = "";
        String By5 = "";
        String By3 = "";

        for (int i = 1; i<=100; i++){
            if (i%3==0&&i%5==0&&i%15==0)
            {
                By15=By15+i+" ";
            }
            else if (i%3==0&&(!(i%15==0)))
            {
                By3=By3+i+" ";
            }
            else if (i%5==0&&(!(i%15==0)))
            {
                By5=By5+i+" ";
            }

        }
        System.out.println(By15 +"\n"+By5 +"\n"+By3);


        System.out.println("--------------------------------------------------");

        for (int i=1;i<=24;i++){

            if (i%2==0 && i%3==0 &&i%5==0) {
                System.out.println("Codility Test Coders");

            } else if (i%2==0 && i%5==0) {
                System.out.println("Codility Coders");

            }else if (i%2==0 && i%3==0){
                System.out.println("Codility Test");

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
