import java.util.Scanner;
public class java14_NovZam
{
          /*
Задача 2 масив
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа, които трябва да се сложат в масива.
Програма трябва да размени местата на най-големия и най-малкия елемент и да изкара масива на екрана.
 Ако има два най-малки или два най-големи да се разменят местата на най-десните.
*/
    public static void main (String []args)
    {

        Scanner rich2 =new Scanner(System.in);
        int n=rich2.nextInt();

        int [] array=new int[n];
        int max=0;
        int min=0;

        for (int i = 0; i <n ; i++) {
            array[i] =rich2.nextInt();
        }

        for(int i =0;i<n;i++ ) {
         if(array[i]>max){
             max=array[i];
            }

            if(array[i]<min) {
                min=array[i];
            }

            System.out.println(max);
            System.out.println(min);

        }
    }

}
