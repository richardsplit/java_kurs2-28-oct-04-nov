import java.util.Scanner;
public class java_8fortaks2

    //Триъгълник

{
        public static void main (String []args)
        {
           int n;
           Scanner input=new Scanner (System.in);
           n =input.nextInt();

           for(int row=0;row<n;row++)
           {
             //Column
             for(int column=0;column<=row;column++)
                {
                 System.out.print("*");

                }
                System.out.println();


           }

        }

}
