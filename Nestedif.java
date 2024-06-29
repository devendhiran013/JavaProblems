import java.util.*;
public class Nestedif {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int dat1=s.nextInt();
        int month=s.nextInt();
        int year=s.nextInt();
        if(month<=12 && year%4==0 && year%100!=0)
        {
            System.out.println("valid");
            
        }
        else if(year%4!=0&&month<=12){
            
        }

    }
}
