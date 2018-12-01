import java.util.Scanner;
class java16_NovZam6Task8 {

    public static void main(String[] args){
        /*8 . Масив
        Да се напише програма,
        която на първия ред приема цяло число N,
        което е големина на масив и
        после  N на брой числа,
        които трябва да се сложат в масива.
      Програмата да изведе всички числа кратни на 5
        , но по-големи от 5.
         */
        Scanner rich7=new Scanner(System.in);
        int n=rich7.nextInt();

        int  [] array = new int[n];


        for (int i = 0; i <n ; i++) {

            if (array[i]>5 && array[i] % 5 ==0 ){
                System.out.println(array[i]);
            }

        }
    }
}
