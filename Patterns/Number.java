package Patterns;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=1;i<=a;i++){
            int temp=i;
            for(int j=1;j<=a;j++){
                System.out.printf("%2d ",temp);
                temp++;
            }
            System.out.println();
        }
    }
}
