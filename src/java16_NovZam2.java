import java.util.Scanner;
public class java16_NovZam2 {

    public static void main (String []args){
        /*4 масив
        Да се напише програма,
        която на първия ред приема цяло число N,
         което е големина на масив и после  N на брой числа,
          които трябва да се сложат в масива.
          Програма трябва да провери дали масива е симетричен
          и да изпише True ,
        ако е ,
        False,ако не е .
         */

        Scanner rich4=new Scanner (System.in);
        int n=rich4.nextInt();

        int [] array3 = new int[n];
        boolean sym=true;

        for (int i = 0; i <n ; i++) {
            array3[i] = rich4.nextInt();

        }

        for (int i = 0; i <n ; i++) {
            if(array3[i]!=array3[n-1-i]) { //trqbva mi obqsnenie
                sym=false;
            }
        }

        if(sym==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }
}
