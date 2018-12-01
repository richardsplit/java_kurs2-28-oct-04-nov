import java.util.Scanner;
public class java_NovZam_DvMasiv0 {
    public static void main (String []args)
    {
        Scanner rich9=new Scanner(System.in);
        int n=rich9.nextInt();
        int n1=rich9.nextInt();
        int [] [] array1 =new int [n][n1];
            double sum=0;
            double totalsum=0;
            double sum1=0;
            double sum2=0;

        for (int i = 0; i <n ; i++) {



            for (int j = 0; j<n1; j++) {

                sum = sum + array1[i][j];
                sum2 =sum+array1[j][i];

            }

        }


        totalsum=sum1+sum2;
        System.out.println(sum);
    }
}
