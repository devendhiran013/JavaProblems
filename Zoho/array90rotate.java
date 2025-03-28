package Zoho;

import java.util.Scanner;

public class array90rotate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j =n-1; j >=0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}