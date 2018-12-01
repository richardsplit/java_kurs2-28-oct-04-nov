import java.util.Scanner;
public class java16_NovZam4 {

    public static void main (String []args){
        /*6 масив
        Да се напише програма,
        която на първия ред приема цяло число N,
        което е големина на масив и после  N на брой числа,
        които трябва да се сложат в масива.
        Програмата да изведе
        средната стойност на въведените числа.
         */
        Scanner rich5= new Scanner(System.in);
        int n=rich5.nextInt();

        int [] array6 = new int[n];
        double aver =0;
        double sum =0;

        for (int i = 0; i <n ; i++) {
            array6[i]=rich5.nextInt();
        sum=sum+array6[i];
        }

        aver =sum/n;
        System.out.println("The average is" +aver);
    }
}
