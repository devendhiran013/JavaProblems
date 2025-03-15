package Array;

import java.util.Arrays;
import java.util.Scanner;

public class singnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = s.nextInt();

        }
        System.out.println(single(n, arr));
    }

    public static int single(int n, int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return arr[n-1];

    }
}
