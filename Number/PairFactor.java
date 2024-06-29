package Number;
import java.util.Scanner;

public class PairFactor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int count=0,i;
        for( i=1;i*i<num;i++){
            if(num%i==0){
                System.out.printf("(%d,%d)",i,num/i);
            }
            count++;
        }
        if(i*i==num) System.out.println(i);
    }
}
