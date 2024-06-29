import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0,n;
        
        System.out.println("Enter a numb");
        n=s.nextInt();
        while(n>0){
            sum+=n%10;
            
            n=n/10;
        }
        System.out.println(sum);

        }
}
