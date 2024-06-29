package Number;

import java.util.Scanner;

public class Armstrongnum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int temp=a,count=0;
        while(a!=0){
            count++;
            a/=10;
        }
        a=temp;
        int res=0;
        while(a!=0){
            int d=a%10;
            res+=Math.pow(d,count);
            a/=10;
        }
        if(res==temp){
            System.out.println("Armstrong num");
        }
        else{
            System.out.println("Not");
        }
    }
}
