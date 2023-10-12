package week01;

public class oksana_tasks {


    public static class EvenOrOdd {

        public static void main(String[] args) {

            System.out.println(EvenOrOdd(5));

            DivideWithoutOperator(89,4);

            FINRA(1, 30);
        }

        public static String EvenOrOdd(int num) {
            String result = "";
            if (num % 2 == 0) {
                result = num + " number is even";
            } else if (num % 2 != 0) {
                result = num + " number is odd";
            }
            return result;
        }



        public static void FINRA(int x, int y) {

            for (int i = x; i <= y; i++) {


                String result = " ";
                if (i % 3 == 0 && i % 5 == 0) {
                    result = "FINRA";
                } else if (i % 5 == 0) {
                    result = "RA";
                } else if (i % 3 == 0) {
                    result = "FIN";
                } else {
                    result = i + "";
                }
                System.out.println(result);
            }
        }


        public static void DivideWithoutOperator(int x, int y) {

            int count = 0;

            while (x >= y) {
                x = x - y;
                count++;


            }
            System.out.println(count + " REMAINDER" + " " + x % y);

        }
    }

}
