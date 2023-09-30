package week02;


public class week02_Pavlo {


    public static void main(String[] args) {
        int a=10;
        int b=5;

        a =a+b;
        b = a - b;
        a = a -b;


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

    }
}
