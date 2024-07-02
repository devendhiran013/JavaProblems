package Array;

import java.util.*;

public class Monotonic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < a - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isDecreasing = false;
            }
            if (arr[i] > arr[i + 1]) {
                isIncreasing = false;
            }
        }

        if (isIncreasing || isDecreasing) {
            System.out.println("Monotonic");
        } else {
            System.out.println("Non-monotonic");
        }

        s.close();
    }
}
