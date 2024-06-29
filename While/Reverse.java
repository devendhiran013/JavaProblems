package While;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int d=0;
        int n =s.nextInt();
        int temp=n;
        int reverse =0;
        while(n!=0){
            d=n%10;
            reverse=(reverse*10)+d;
            n = n/10;    
        }
        System.out.println(reverse);
        if(reverse==temp){
            System.out.println("palindrome");
        }
        else{
            System.out.print("not");
        }

    }
}
