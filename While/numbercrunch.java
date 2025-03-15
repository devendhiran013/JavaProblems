package While;
import java.util.Scanner;

public class numbercrunch {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int pv=1; int temp=num;
        while(temp>9){
            pv*=10;
            temp/=10;
        }
        while(pv!=0){
            System.out.print(num/pv+" ");
            num%=pv;
            pv/=10;
        }

        
    }
}