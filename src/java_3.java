/*
    Фирма получава заявка за изработването на проект, за който са необходими определен брой часове. Фирмата разполага с определен брой дни. През 10% от дните служителите са на обучение и не могат да работят по проекта. Един нормален работен ден във фирмата е 8 часа. Проектът е важен за фирмата и всеки служител задължително работи по проекта в извънработно време по 2 часа на ден.
Часовете трябва да са закръглени към по-ниско цяло число (например → 6.98 часа се закръглят на 6 часа).
Напишете програма, която изчислява дали фирмата може да завърши проекта навреме и колко часа не достигат или остават.

Входни данни
Входът се чете от конзолата и съдържа точно 3 реда:
На първия ред са необходимите часове – цяло число в интервала [0 … 200 000].
На втория ред са дните, с които фирмата разполага – цяло число в интервала [0 … 20 000].
На третия ред е броят на всички служители – цяло число в интервала [0 … 200].
Изходни данни
Да се отпечата на конзолата един ред:
Ако времето е достатъчно:
“Yes!{оставащите часове} hours left.“.
Ако  времето НЕ Е достатъчно:
“Not enough time!{недостигащите часове} hours needed.“.
   */

/*primer ot lektora
import java.util.Scanner;

public class ProjectWork {

   public static void main(String[] args) {

       //Const
       final int dayHours = 8;
       final int extraHours = 2;
       final double offWork = 0.1;

       //Input
       int projectHours;
       int availableDays;
       int workers;

       //Output
       int totalHours;
       double workHours;

       Scanner input = new Scanner(System.in);

       projectHours = input.nextInt();
       availableDays = input.nextInt();
       workers = input.nextInt();

       totalHours = (workers * (extraHours + dayHours)) * availableDays;

       workHours = Math.floor(totalHours*(1-offWork));

       if (workHours > projectHours) {
           System.out.println(“Yes! “+ (workHours - projectHours) +” left”);
       } else {
           System.out.println(“Not enough time !  “+ (projectHours - workHours) +” hours needed”);
       }

   }
}
 */

import java.util.Scanner;

public class java_3
{
    public static void main (String []args)
    {
        /*


        nd-available days
        ofW-10% not working ,training
         em-needed workers
         hw-need ehours working

         Math.ceil-закръгляне
         Маth.ceil(100,65)->101
         Math.floor(100,65)->100

         final int - не променяща се променлива
         */

        int nh,nd,em;

        final int dayHours =8;
        final int extraHours =2;
        final double offWork =0.1;

        Scanner input =new Scanner (System.in);
        System.out.print("Въведете необходимите часове:");
        nh=input.nextInt();

        System.out.print("Въведете срок:");
        nd=input.nextInt();


        System.out.print("Въведете необходимите работници:");
        em=input.nextInt();


        int totalHours =(em*(extraHours+dayHours))*nd;
        System.out.print("Необходимите часове нужни са: " +totalHours);

        double workHours =Math.floor(totalHours*(1-offWork));
       System.out.println("Working hours" +workHours);

       if (workHours>nh)
            {
           System.out.println("Yes!" +(workHours-nh) +" left");
                }
                else {
                    System.out.println("Not enough time !" + (nh-workHours)+"hours needed");
                    }

       /*

        */
    }


}

