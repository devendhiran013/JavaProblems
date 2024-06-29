package Number;
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
        long count=0;
        for(long i=1;i<a/2;i++){
             if(a%i==0){
                System.out.println(i);
                
             }
            count++;
        }
        System.out.print(count);
    }
}
