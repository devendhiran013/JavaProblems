package TwodimenArray;

import java.util.Scanner;

public class identicalmatrix {
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
        // int k = 0;
        // for (int i = 0; i < a-1; i++) {
        //     for (int j = 0; j < b-1; j++) {
        //         if (arr[i][j] == arr[i + 1][j + 1]) {
        //             k = 1;
        //         }
        //     }
        // }
        boolean k=true;
        for(int i=0;i<a;i++){
            if(arr[0][0]!=arr[i][i]){
             k=false;
             break;
            }
        }
        if (k ) {
            System.out.println("identical");
        }
        else{
            System.out.println("non identical");
        }
    }
}
