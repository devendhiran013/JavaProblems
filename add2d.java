import java.util.Scanner;

public class add2d {
    // You are using Java

    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int x[][]=new int[r][c];
        int sum[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                x[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]+=x[i][j];
            }
            
        }
        int sc=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j)
                sc+=sum[i][j];
            }
        
        }
        System.out.println(sc);
        s.close();
    }
}

