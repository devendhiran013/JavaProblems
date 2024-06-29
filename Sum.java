import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int d=0;
        int x[]=new int[a];
        for(int i=0;i< a ;i++){
           
                x[i]=s.nextInt();
                 System.out.println("entered numbers are"+x[i]);
            
                d=d + x[i];
                
             
            }
            System.out.println("sum"+d);
    }
}
