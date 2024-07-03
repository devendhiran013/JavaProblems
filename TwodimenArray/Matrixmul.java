package TwodimenArray;

import java.util.Scanner;

public class Matrixmul {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int arr1[][] = new int[a][b];
        int arr2[][] = new int[a][b];
        int i, j;
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                arr1[i][j] = s.nextInt();

            }
        }
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                arr2[i][j] = s.nextInt();

            }
        }
        System.out.println();

        int sum[][] = new int[a][b];

        for (i = 0; i < a; i++) {
            System.out.println();
            for (j = 0; j < b; j++) {
                for (int k = 0; k < a; k++) {
                    sum[i][j] += arr1[i][k] * arr2[k][j];

                }
                System.out.print(sum[i][j] + " ");

            }
        }
    }
}
