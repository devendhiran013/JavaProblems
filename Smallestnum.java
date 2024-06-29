import java.util.Scanner;

public class Smallestnum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int d=b-1;int c=10; 
        for(int i=2;i<b;i++){
            c*=10;
            c+=d;
        }
        System.out.println(c);
    }
} 
