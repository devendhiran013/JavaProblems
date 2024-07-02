package TwodimenArray;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int min;
        for(int i=0;i<a;i++){
            min=arr[i][0];
            for(int j=0;j<b;j++){
                if(min>arr[i][j]){
                     min=arr[i][j];
                }
            }
            System.out.println(min);
        }
        
        s.close();
    }
}
