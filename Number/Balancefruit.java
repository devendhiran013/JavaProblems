package Number;

import java.util.Scanner;

public class Balancefruit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int m=s.nextInt();
        int rs=s.nextInt();
        if(a>0&&m>0){
            if(a>m){
                rs-=(a-m);
            }
            else if(a<m){
                rs+=m-a;
            }
            else{ 
                System.out.println(rs);
            }
        }
        else{
            System.out.println("positive values only");
        }
        System.out.println(rs);
       
    }
}
