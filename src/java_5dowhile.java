import java.util.Scanner;
public class java_5dowhile
{

    public static void main (String []args)
    {
        //input
         int sideA;
         int sideB;

         Scanner input = new Scanner(System.in);
         sideA =input.nextInt();
         sideB =input.nextInt();

         int line=0;
         int column=0;

         while (line<sideA)
         {
             System.out.print(line);
             while (column<sideB)
             {
                 System.out.print("*");
                 column++;
             }
             System.out.println();
             column =0;
            line++;

         }
    }
}

