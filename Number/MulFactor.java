package Number;

import java.util.Scanner;

public class MulFactor {
 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    System.out.println("1 * "+a);
    for(int i=2;i*i<=a;i++){
        if(a%i==0)
        System.out.println(i+" * "+a/i);
    }
 }

}
