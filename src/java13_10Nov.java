import java.util.Scanner;
public class java13_10Nov
{
  public static void main (String []args)
  {

      /*
      Задача 1
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после
 N на брой числа, които трябва да се сложат в масива.
Програма трябва да направи всички четни числа на 0 и да изкара масива на екрана.

       */

      Scanner rich =new Scanner (System.in);

      int n =rich.nextInt();
      int [] FirstArray = new int[n];

      for (int i = 0; i <n ; i++)
      {
        int a=rich.nextInt();

        if(a%2==0)
        {
            FirstArray[i]=0; //
        }
        else {
         FirstArray[i]=a;
        }


      }

      for (int i = 0; i <n ; i++)
      {
          System.out.print(FirstArray[i]+ " ");

      }








  }

}
