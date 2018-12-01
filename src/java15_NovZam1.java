import java.util.Scanner;
public class java15_NovZam1
{
    public static void main (String []args)
    {
        /*3 масив
        Да се напише програма,
        която на първия ред приема цяло число N
        , което е големина на масив
        и после  N на брой числа,
        които трябва да се сложат в масива.
         Програма трябва да "reverse"-не  масива и
         да го изкара на екрана.
         */
        Scanner rich3 =new Scanner (System.in);
        int n=rich3.nextInt();

        int [] array2= new int[n];

        for (int i = 0; i <n ; i++) {
        array2[i]=rich3.nextInt();
        }

        for(int i=0;i<array2.length/2;i++)
        {
          int temp=array2[i];
          array2[i]=array2[array2.length -i-1]; //Trqbva mi obqsnenie
          array2[array2.length-i-1]=temp;
        }

        for (int i = 0; i <n ; i++) {
            System.out.println(array2[i]);
        }

    }
}
