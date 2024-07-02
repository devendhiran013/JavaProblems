package TwodimenArray;

import java.util.*;

public class Addmatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int arr[][] = new int[a][b];
       
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println();
        int c = s.nextInt();
        int d = s.nextInt();
        int arr1[][] = new int[c][d];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = s.nextInt();
            }
        }

        int sum[][]=new int[a][b];
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < b; j++) {

               sum[i][j]= arr[i][j] + arr1[i][j];
               System.out.print(sum[i][j]+" ");
            }

        }

        s.close();
    }
}
