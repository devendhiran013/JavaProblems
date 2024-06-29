import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0,n;
        System.out.println("Enter a numb");
        n=s.nextInt();
        if(n>0){
            sum+=n%10;
            n=n/10;
            sum+=n%10;
        }
        if(sum==3 || sum==8){
            System.out.println("winner");
        }
        else{
            System.out.println("looser");
        }
        }
}
