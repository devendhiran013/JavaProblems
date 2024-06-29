import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int x[]=new int[a];
        
        for(int i=0;i< a ;i++){
           
                x[i]=s.nextInt();
                System.out.println("entered numbers are"+x[i]);
            }
        
        for(int i=a-1;i>0 ;i--) {
             System.out.println("entered numbers are"+x[i]);
        }
           
        }

        
    }
    

