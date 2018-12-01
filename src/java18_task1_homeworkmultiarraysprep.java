import java.util.Scanner;
public class java18_task1_homeworkmultiarraysprep {
    public static void main(String []args){
        Scanner reader=new Scanner(System.in);
        int n=0;
        int k=0;
        //int n=reader.nextInt();
        ;

        int [] [] array =new int [n][k];
        for (int i = 0; i<=n; i++) {
            for (int j =1; j<=k ; j++) {

                if (i==0){
                    array[i][j]=1;
                    System.out.println("Отворена");
                }
                else {
                    array[i][j]=0;
                    System.out.println("Затворена");
                }
            }
        }


 }
}
//
    /*
public static void printDoorsOpened(final int passes)
{
    int j = 1;
    for(int i = 1; i <= passes; i++)
    {
        if(j*j == i){
            j++;
            System.out.println("The door number "+i+" is Opened");
        } else {
            System.out.println("The door number "+i+" is Closed");
        }
    }
}
*/

    /*
    class HundredDoors {
    public static void main(String[] args) {
        boolean[] doors = new boolean[101];

        for (int i = 1; i < doors.length; i++) {
            for (int j = i; j < doors.length; j += i) {
                doors[j] = !doors[j];
            }
        }

        for (int i = 1; i < doors.length; i++) {
            if (doors[i]) {
                System.out.printf("Door %d is open.%n", i);
            }
        }
    }
}
If only printing the result is required.

class HundredDoors {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            System.out.printf("Door %d is open.%n", i * i);
    }
}
     */