package Array;

import java.util.Scanner;

public class Midelement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
System.out.println(fd(arr,a));
    }



public static int fd(int arr[],int a){
    int fd[]=new int[a];
      for(int i=0;i<a;i++){
          if(arr[i]>0){
            fd[i]=arr[i];
          }
      }
      int len=(fd.length-1)/2;
      return len;
}}
