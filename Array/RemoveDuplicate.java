package Array;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        int i, j = 0;
        for (i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }

        for (i = 0; i < a; i++) {
            int k = 0;
            for (j = i + 1; j < a; j++) {
                if (arr[i] == arr[j]) {
                    k = 1;
                    
                }

            }

            if (k != 1) {
                System.out.print(arr[i] + " ");
            }
        }
        s.close();
    }
}
