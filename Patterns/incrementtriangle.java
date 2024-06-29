package Patterns;

import java.util.Scanner;

public class incrementtriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        // increment pattern
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
        //decrement pattern
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
        //decrement 
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
        //increment
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
       for(int i=1;i<=num;i++){
            for(int space=1;space<=num-i;space++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
