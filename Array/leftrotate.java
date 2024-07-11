package Array;

import java.util.Scanner;

public class leftrotate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        } 
        int rot=s.nextInt();
        for(int j=1;j<=rot;j++){
            int temp=arr[0];
        for(int i=0;i<=a-2;i++){
             arr[i]=arr[i+1];
             
        }
        arr[a-1]=temp;}  
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
       }
}        
