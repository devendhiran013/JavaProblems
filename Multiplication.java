import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int count=0;
        for(int i=1;i<=b;i++){
            count+=a;
        }
        System.out.print(count);
    }
}
