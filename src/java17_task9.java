import java.util.Scanner;
public class java17_task9 {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        int rows = 2; //sc.nextInt();

        // Scanner sc = new Scanner(System.in);
        int cols = 2; //sc.nextInt();

        // Scanner sc = new Scanner(System.in);
        int colNum = 2-1; //sc.nextInt();

        int sum = 0;

        int[][] arr = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (col == colNum) {
                    Scanner sc = new Scanner(System.in);
                    arr[row][col] = sc.nextInt();
                    sum += arr[row][col];
                } else {
                    Scanner sc = new Scanner(System.in);
                    arr[row][col] = sc.nextInt();
                }
            }
        }
        System.out.println(sum);

    }
}
