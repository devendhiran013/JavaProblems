package Number;

import java.util.Scanner;

public class divisibleoffour {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int range=s.nextInt();
        int sumf=0,nf=0;
        for(int i=1;i<=range;i++){
            if(i%a==0){
                sumf+=i;
            }
            else{
                nf+=i;
            }
        }
      
        System.out.println(nf-sumf);
    }
}
