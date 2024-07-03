package TwodimenArray;

import java.util.Scanner;

public class Upperdiagonal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int arr[][] = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        boolean k=true;
        for(int i=a-1;i>0;i--){
            if(arr[0][a-1]!=arr[i-1][i-1]){
             k=false;
             break;
            }
            
        }
        if (k ==true) {
            System.out.println("identical");
        }
        else{
            System.out.println("non identical");
        }
        s.close();
    }
}
