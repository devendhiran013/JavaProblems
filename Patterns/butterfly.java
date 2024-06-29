package Patterns;
import java.util.*;


public class butterfly {
   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
      for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        for(int k=1;k<=2*(num-i);k++){
            System.out.print("   ");
        }
        for(int h=1;h<=i;h++){
            System.out.print(" * ");
        }
        System.out.println();
      }
      for(int i=num;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        for(int k=1;k<=2*(num-i);k++){
            System.out.print("   ");
        }
        for(int h=1;h<=i;h++){
            System.out.print(" * ");
        }
        System.out.println();
      }
       
}}
