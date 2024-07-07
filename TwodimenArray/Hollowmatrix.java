package TwodimenArray;

import java.util.Scanner;

/**
 * Hollowmatrix
 */
public class Hollowmatrix {

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
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < b; j++) {
                
                if(i==0||i==a-1||j==0||j==b-1){
                    System.out.print(arr[i][j]+"  ");
                }
                else{
                    System.out.print("   ");
                }
            }
        }
    }
}

