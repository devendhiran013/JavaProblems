package Number;

import java.util.Scanner;

public class Triperpect {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a*3,sum=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        if(sum==b){
            System.out.println(a+" The Number is triperfect number");
        }
        else{
            System.out.println(a+" The Number is not triperfect number");
        }
    }
}
