package Array;

import java.util.Scanner;

public class Sortedarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[][] = new int[a][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < a; i++) {
            boolean asec=true;
            boolean desc=true;
            
            for (int j =0; j < a-1; j++){
                if (arr[i][j] < arr[i][j+1] ){
                    desc=false;
                }
                if( arr[i][j] > arr[i][j+1]) {
                    asec=false;
                }
            
            }
            if(asec|| desc){
                count++;
            }
        }
        System.out.println(count);
    }}
    
