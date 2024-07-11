package TwodimenArray;
import java.util.Scanner;

public class SortedArraycount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); // number of rows
        int b = sc.nextInt(); // number of columns
        
        int[][] arr = new int[a][b];
        
        // Reading the array elements
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int count = 0;
        
        // Check each row
        for (int i = 0; i < a; i++) {
            boolean asc = true;
            boolean desc = true;
            
            for (int j = 1; j < b; j++) {
                if (arr[i][j] < arr[i][j - 1]) {
                    asc = false;
                }
                if (arr[i][j] > arr[i][j - 1]) {
                    desc = false;
                }
            }
            
            if (asc || desc) {
                count++;
            }
        }
        
        // Print the count of sorted rows
        System.out.println(count);
    }
}
