import java.util.Scanner;
public class java16_NovZam5
{
    public static void main (String [] args){

        /*7. Масив
        Да се напише програма,
        която на първия ред приема цяло число N,
        което е големина на масив и после  N на брой числа,
        които трябва да се сложат в масива.
        Програмата да изведе числото,
        което е най-близко до средната стойност на въведените числа.
         */
        Scanner rich6= new Scanner(System.in);
        int n=rich6.nextInt();

        int [] array4 = new int [n];

        double aver=0;
        double sum=0;

        for (int i = 0; i <n ; i++) {
            array4[i]=rich6.nextInt();

            sum=sum+array4[i];
        }
        aver =sum/n;
        System.out.println(Math.round(aver)); /* <- Trqbva mi obqsnenie //
         освен ако не е че закръглената стойност се води
        най-близко до средната такава*/
    }
}

/*
package com.company;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       //Task4
       // Scanner sc = new Scanner(System.in);
       int n = 7; //sc.nextInt();

       int[] arr = {1, 2, 112, 99, 5, 666, 7}; //new int[n];

       double sum = 0.0;

      /* for (int i = 0; i < n; i++) {
           Scanner itemArr = new Scanner(System.in);
           arr[i] = itemArr.nextInt();
       }*/

/*
       for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
        }
        double average = sum / n;

        int smallestDiff = Integer.MAX_VALUE;
        int closest = 0;

        for (int i = 0; i < n; i++) {
        int currentDiff = Math.abs(((int) average - arr[i]));

        if (currentDiff < smallestDiff) {
        smallestDiff = currentDiff;
        closest=arr[i];
        }
        }
        System.out.println(average);
        System.out.println(closest);
        }
        }

 */