package Array;

import java.util.Scanner;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        

        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        int pass,temp,k=s.nextInt();
        for(pass=0;pass<k;pass++){
            for(int i=0;i<a-1-pass;i++){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                //decending order
                // if(arr[i]<arr[i+1]){
                //     temp=arr[i];
                //     arr[i]=arr[i+1];
                //     arr[i+1]=temp;
                // }
            }
        }
        System.out.println(arr[a-k]);
        for(int itr:arr){
            System.out.print(itr+" ");
            
        }
        s.close();
    }
  
}
