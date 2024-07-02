package Array;

import java.util.Scanner;

public class Rightrotate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        int i;
        for( i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        
        int rotatecount=s.nextInt();
        for(i=1;i<=rotatecount%a;i++){
           int temp=arr[a-1];

        for(i=a-1;i>0;i--){
            arr[i]=arr[i-1];
           
        }
        arr[0]=temp;}
    
        for(int itr:arr){
            System.out.print(itr+" ");

        }
        s.close();
    }
}
