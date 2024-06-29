package Number;

import java.util.Scanner;

public class oddevensegregation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
         int pv=1,odd=0,even=0,key=s.nextInt(),temp=a,dig=0;
    
        while(a>9){
            pv*=10;
            a/=10;
        }
        a=temp;
        while(pv!=0){
             dig=a/pv;
            if(dig%2==0){
                even=(even*10)+dig;
            }
            else{
                odd=(odd*10)+dig;
            }
            a%=pv;
            pv/=10;

        }
        if(key==0){
           System.out.println(odd+""+even);
        }
        else{
            System.out.println(even+""+odd);
        }
    }
    
}
