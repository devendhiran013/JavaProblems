package Number;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=1,n2=1, n3=0,count=s.nextInt();
        for(int i=1;i<count;i++){
         n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(n3);
    }
}
