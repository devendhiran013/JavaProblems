import java.util.Scanner;

public class Leader {
    public static void main(String[] args) {
        int n1=3;
        int n2=0;
        int n=n1+n2;
        int temp=0;
        int x=n;
            for(int i=0;i<=n;i++){
                n+=i;
                if(prime(n)){
                   temp=i; 
                   break;
                }else{
                    n=x;
                }
            }
        System.out.print(temp);
    }
    public static boolean prime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
