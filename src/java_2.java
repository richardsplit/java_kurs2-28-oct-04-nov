import java.util.Scanner;

public class java_2 {


    public static void main (String []args)
    {



        /*
        T-taksi
        A-avtobus
        V-vlak
        dist-razstoqnie
        dn-day or night
        Td-taksi dnevna
        Ad-avtobus dnevna
        Vd-vlak dnevna
        Tn-taksi noshtna
        An-avtobus noshtna
        Vn-vlak noshtna


        Adistance-avtobus distance
        Vdistance -vlak distance



        */
        double T,A,V,Td,Ad,Vd,Tn,An,Vn,n;

        Td =0.79;
        Tn=0.90;

        Ad=0.09;
        An=Ad;
        Vd=0.06;
        Vn=Vd;




        Scanner input =new Scanner(System.in);
        System.out.print("Въведете дистанция:");
        int dist=input.nextInt();
        System.out.print ("Ден или нощ ?");
        int dn=input.nextInt();

        if (dn==1){
            System.out.print( "През ноща,");

        }
        else{
            System.out.print("През деня,");
        }

        if (dist<20)
        {

            double n1=dist*Td;
            System.out.print ("вземете такси :) ");
            System.out.println("цената ще е:" +n1);
        }

        if (dist>=20)
        {

            double n3=dist*Ad;
            System.out.print ("вземете автобус :) ");
            System.out.println(" Цената ще е :" +n3);
        }


        if (dist>=100)
        {

            double n5=dist*Vd;
            System.out.print ("вземете влак :)");
            System.out.print(" Цената ще е :" +n5);
        }

    }
}
