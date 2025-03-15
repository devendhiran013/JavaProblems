package While;

import java.util.Scanner;

public class negativesum {

   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
   
    int arr[]=new int[4];
    int sum=0;
    for(int i=0;i<4;i++){
        arr[i]=s.nextInt();
        
    }
    for(int i=0;i<arr.length;i++){
       
        if(arr[i]<0){
            sum+=arr[i];
        }
    }
    System.out.println(sum);
   }
}