/*
Da se napishe  programa koqto vuvejda dve celi chisla n i 1 i generira po azbuchen red vsichki
vuzmojni tupi paroli koito se systoqt ot slednite 5 simvola

Simvol 1 cifra ot 1 do n
Simvol 2 cifra ot 1 do n
Simvol 3 :malka bukva izmejdu purvite 1 bukvi na latinskata azbuka
Simvol 4 malka bukva izmejdu purvite I bukvi na latinskata azbuka
Simvol 5 cifra ot 1 do n ,po-golqmo ot purvite 2 cifri

*/

import java.util.Scanner;
public class java12_task {
    public static void main(String[] args) {
        //Declarirame n i l
        int n;
        int l;

        Scanner input = new Scanner(System.in);
        System.out.print("Vuvedete n:");
        n = input.nextInt();

        System.out.print("Vuvedete l:");
        l = input.nextInt();

        for (int i1 = 1; i1 <= n; i1++)
        //first number of the password
        {
            for (int i2 = 1; i2 <= n; i2++)
            //second number of the password
            {
                for (char c1 = 'a'; c1 <='a'  + 1; c1++)

                { //first char of the password
                for (char c2= 'a';c2<= 'a' +1 ; c2++)
                     { //second char of the password
                     for (int i3 = Math.max(i1,i2)+1 ; i3<= n ;i3++)
                        {
                        System.out.println (String.format("%d%d%c%c%d" ,i1,i2,c1,c2,i3));
                        //String.format("%d%d%c%c%d" + stoinostite)-string format se izpozvla kato
                            // imame razlichni tipove promenlivi koito iskame da izkarame (%d-decimal chislo,%c-character,*s-string)
                        }
                     }
                }

            }


        }


    }
}