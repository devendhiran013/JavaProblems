package Number;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int i;
        for(i=2;i*i<=num;i++){
            if(num%i==0) {
                break;}
        }
        if(i*i>num){
            System.out.println("prime");
        }
        else System.out.println("not");
    }
}
