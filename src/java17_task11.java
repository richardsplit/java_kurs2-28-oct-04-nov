import java.util.Scanner;
public class java17_task11 {
/*
3 Задача.

Да се напише програма ,
която получава числа n и m - големина на матрица,
и после n*m числа,
които са елементите на матрицата.
Програмата ви трябва да изкара най- големия елемент от всеки ред
 и после от всяка колона.
 */
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();

        int[][] arr = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        int biggestrowvalue = 0;
        int biggestcolumnvalue = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (biggestrowvalue < arr[row][col]) {
                    biggestrowvalue = arr[row][col];

                }

            }
            System.out.println(biggestrowvalue);
            biggestrowvalue = 0;
        }

        for (int row = 0; row < cols; row++) {
            {
                for (int col = 0; col < rows; col++) {
                    if (biggestcolumnvalue < arr[col][row]) {
                        biggestcolumnvalue = arr[col][row];
                    }
                }
                System.out.println(biggestcolumnvalue);
                biggestcolumnvalue = 0;
            }
        }
    }
}
