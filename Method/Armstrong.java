package Method;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        
    }
}
