package Number;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsequetive {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
            
        }
        Arrays.sort(arr);
        

    }
}