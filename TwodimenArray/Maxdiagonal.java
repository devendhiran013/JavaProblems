package TwodimenArray;
import java.util.*;
public class Maxdiagonal {
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int arr[][] = new int[a][b];
        int i,j;
        for ( i = 0; i < a; i++) {
            for ( j = 0; j < b; j++) {
                arr[i][j] = s.nextInt();
                
            }
        }
        System.out.print("Enter 0 or 1: ");
        int key=s.nextInt();
        int max=0,min;

     if(key ==0){
        for ( i = 0; i < a; i++) {
            max=arr[i][0];
            for ( j = 0; j < b; j++) {
                if(i==j){
                if (max<arr[i][j]) {
                    max=arr[i][j];
                }
            }
            }
        }
        System.out.println(max);
    }
    else{
        min=arr[0][b-1];
        for ( i = 0; i < a; i++) {
            
            for ( j = 0; j < b; j++) {
                if(i+j==j-1){
                if (min>arr[i][j]) {
                    min=arr[i][j];
                }
            }
            }
        }
        System.out.println(min);
    }
        
        s.close();
    }
}

