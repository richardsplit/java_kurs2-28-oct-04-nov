import java.util.Scanner;
public class java_7for_task1 {


    //Правоъгълник

    public static void main(String[] args)
    {
        int n;

        Scanner input =new Scanner(System.in);
        n=input.nextInt();

        for(int row=0;row < n ;row++){

            //COLUMN
            for (int column =0 ;column<n;column++){
                System.out.println("*");

            }
            System.out.println();

        }

    }
}