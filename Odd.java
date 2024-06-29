import java.util.Scanner;

public class Odd {
    public static void main(String[]args){
      
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int x[]=new int[a];
        for(int i=0;i<a;i++){
                x[i]=s.nextInt();
                
        }
        if(a%2==0){
                int c=0;
                c=(x[(a/2)-1])+(x[a/2]);
                System.out.println("Even "+c);
        }
        else{
            System.out.println(x[a/2]+" odd");
        }
    s.close();
}
}

    



    

