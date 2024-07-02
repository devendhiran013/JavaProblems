package Array;

import java.util.Scanner;

public class Arraymul {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int  arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            sum+=arr[i];
        }

        for(int i=0;i<n;i++){
           int d=sum-arr[i];
            System.out.print(d+" ");
        }
        System.out.println();

        for(int i=0;i<n;i++){
            sum-=arr[i];
            System.out.print(sum+" ");
        }
        s.close();
    }
}
