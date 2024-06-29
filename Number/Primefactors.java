package Number;

import java.util.Scanner;

public class Primefactors {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int i;
        int count=0;
        for(i=2;i<=a;i++){
            if(a%i==0){
                count++;
                System.out.print(i+"->"+count);
                
                a=a/i;
                count=0;
                
            }
        }
       
    }
    
}
