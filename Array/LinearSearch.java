package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        int arr[]=new int[a];   
        int i;
        for(i=0;i<a;i++){
            arr[i]=s.nextInt();
            
        }
        int key=s.nextInt();
        for(i=0;i<a;i++){
            if(arr[i]==key){
                break;
            }     
        }
        if(i<a){
            System.out.println("found "+arr[i]);
        }
        else{
            System.out.println("not found");
        }
        s.close();
    }
}
