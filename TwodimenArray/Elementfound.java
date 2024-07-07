package TwodimenArray;

import java.util.Scanner;

public class Elementfound {
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
        int k=s.nextInt();
        boolean f=false;
        int index=0,l=0;
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr[i][j]==k) {
                  f=true;
                  index=i;
                  l=j;
                  break; 
                }
            }
        }
        if (f==true) {
            System.out.println("found at position : ("+index+","+l+")");
        }
        else{
            System.out.println("not found");
        }
}
}