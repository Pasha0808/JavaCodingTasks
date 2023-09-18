public class shahrTask2 {


        /*

Task02:
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator

         */
//added task2

        public static void main(String[] args) {
        divideWithoutDivision(7,4);
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
