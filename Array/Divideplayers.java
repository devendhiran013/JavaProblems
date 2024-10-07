package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Divideplayers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int b=a-1,mul=0;
        for(int i=0;i<a/2;i++){
            mul+=arr[i]*arr[b];
            b--;
        }
        System.out.println(mul);
    }
}
