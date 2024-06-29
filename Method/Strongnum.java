package Method;

import java.util.Scanner;

public class Strongnum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
       int temp=num,sum=0;
       while(num!=0){
        int d=num%10;
        sum=sum+factorial(d,num);
       }
        
        if(temp==sum){
            System.out.println("Strong num");
        }
        else{
            System.out.println("not");
        }
    }
    public static int factorial(int fact,int num){
        fact=1;
        for(int i=1;i<=num;i++ ){
            
            fact*=i;
            
        }
        return fact;
    }
}
