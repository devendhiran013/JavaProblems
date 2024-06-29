package Patterns;

/**
 * Diagonal
 */
import java.util.*;
public class Diagonal {

    

public static void main(String[] args) {
        
    
    Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                
                if(i==j||i+j==num+1)
                    System.out.print(i+"  ");
                else{
                    System.out.print("   ");
                }
            }
        System.out.println();
        }
}
}