import java.util.Scanner;

public class datrixPattern {
    public static void main(String[] args) {
        int r=3;
        int c=3;
        int k=1;
        int sum=0;
        int arr[][]=new int[r][c];
        while(sum<r+c-1){
            for(int i=0; i<r;i++){
                for(int j=0;j<c;j++){
                    if(sum==i+j){
                        arr[i][j]=k++; 
                        System.out.print(arr[i][j]+" ");
                    }
                }
                System.out.println();
            }
            sum++;  
        }
        // for(int i=0; i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }

}
