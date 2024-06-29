package While;
import java.util.Scanner;

/**
 * NumtoDigit
 */
public class NumtoDigit {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long num=s.nextLong();
        long mul=0;
        while(num!=-1){
            mul=(10*mul)+num;
            num=s.nextLong();
        }
        System.out.println(mul);
    }
}