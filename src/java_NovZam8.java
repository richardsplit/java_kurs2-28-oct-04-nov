import java.util.Scanner;
public class java_NovZam8 {

    public static void main (String []args) {
      /*  int[] arr={1,2,3,4,5};
        int[] arr2=arr;

        arr2[2]=4;

        System.out.println(arr2[2]);
    */
        int[] arr = {3, 2, 3, 4, 5};
        //System.out.println(arr);
    }

              static void bubbleSort(int[]arr){
                    int n=arr.length;
                    for (int i = n - 1; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {

                            if (arr[j] > arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }

                  //  static boolean isSorted(int[]arr){
                        for(int i=0;i<arr.length;);

                                }
                }




