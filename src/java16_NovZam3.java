import java.util.Scanner;
public class java16_NovZam3 {

    public static void main(String []args){
/*5 масив
Да се напише програма, която на първия ред приема цяло число N,
което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива.
Програма трябва да изкара сумата на всички числа в масива.
 */
        Scanner rich5=new Scanner (System.in);
        int n= rich5.nextInt();

        int [] array4=new int[n];
        int sum=0;

        for (int i = 0; i <n ; i++) {
            array4[i] = rich5.nextInt();
       sum=sum + array4[i];/*<- Trqbva mi obqsnenie ili moeto e che se vzima stoinosta v kletkata
       i se prisvoqva na sum ,
             i na sledvashtoto stuplenie na broqcha se dobavq
            i sledvashtata stoinost na sledvashsta kletka,
            2)vupros - moje li promenliva da q izpolzvame v samata neq sum=sum+...
             */

        }

        System.out.println(sum);


        }
    }


