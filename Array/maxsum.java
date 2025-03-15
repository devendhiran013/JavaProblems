package Array;

import java.util.Scanner;

class maxsum {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[][]=new int[a][a];
        int sum=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int rm=0,cm=0;
        for(int i=0;i<a;i++){
            int rsum=0,csum=0;
                for(int j=0;j<a;j++){
                    rsum+=arr[i][j];
                    if(rsum>rm){
                        rm=rsum;
                    }
                    csum+=arr[j][i];
                    if(csum>cm){
                        cm=csum;
                    }
                }
            
        }
        
        for(int i=0;i<a-1;i++){
            
            for(int j=0;j<a;j++){
                  if(arr[i][j]<arr[i+1][j+1]){
                    int temp=arr[i][j];
                    arr[i][j]=arr[i+1][j+1];
                    arr[i+1][j+1]=temp;
                  }
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    
       
    }
}
