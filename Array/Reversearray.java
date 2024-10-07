package Array;

import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int first,last,temp;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        //reverse travsal
        // for( int i=n-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        //}
        for(first=0,last=n-1;first<last;first++,last--){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

        }
        System.out.println();
        
        
        for(int element:arr) System.out.println(element);
        s.close();
    }
} 