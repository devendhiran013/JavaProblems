package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        
    
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int arr[]=new int[a];
    
    for(int i=0;i<a;i++){
        arr[i]=s.nextInt();
    }
    int first=0,last=a-1;
    int mid=0;
    int key=s.nextInt();
    while(first<=last){
        mid=(first+last)/2;
        if(arr[mid]==key){
            break;
        }
        else{
            if(arr[mid]<key){
                first=mid+1;
            }
            else{
                last=mid-1;
                
            }
        }}
      if(first<last){
        System.out.println("found");
      }
      else{
        System.out.println("not found");
      }
      s.close();
    }
    
}
