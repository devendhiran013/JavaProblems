package Patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int i,j,k;
    for(i=1;i<num;i++){
        for(j=1;j<=num-i;j++){
            System.out.print("   ");
        }
        for(k=1;k<=i*2-1;k++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    for(i=num;i>=1;i--){
        for(j=1;j<=num-i;j++){
            System.out.print("   ");
        }
        for(k=1;k<=i*2-1;k++){
            System.out.print(" * ");
        }
        System.out.println();
    }
}
}