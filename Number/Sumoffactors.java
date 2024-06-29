package Number;
import java.util.Scanner;

public class Sumoffactors
 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sum=0;
        int i;
        for(i=2;i*i<=num;i++){
            if(num%i==0) 
                sum+=i+(num/2);
        }
        System.out.println(sum);
        if(sum==num)System.out.println("perfect");
        else if(sum>num)System.out.println("abduntant");
        else System.out.println("defeciency");
    }
}
