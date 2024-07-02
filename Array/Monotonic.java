package Array;
import java.util.*;
public class Monotonic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        int k=0,f=0;
        for(int i=0;i<a;i++){
           
             for(int j=i+1;j<a;j++){
                if(arr[i]>arr[j]){
                      k=1;
                }
                if(arr[i]<arr[j]){
                    f=1;
                }
            }
        }
       
        
        if(k==0||f==0){
            System.out.println("Monotonic");
        }
        else{
            System.out.println("Non Monotonic");
        }
    }
}
