package While;
import java.util.Scanner;
//product for n natural number;
public class factorial {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int f=1,y=0,sd;
            for(int i=1;i<=n;i++){
                f=f*i;
            }
            System.out.println("factorial of "+f);
            while(f!=0){
                sd=f%10;
                f=f/10;
                if(sd==1){
                    y++;
                }
                
            }
            if(y>0){
                System.out.print("Yes");
            }
            else {System.out.print("No");}
             
        } 
}
