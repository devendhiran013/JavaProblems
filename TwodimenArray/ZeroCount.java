package TwodimenArray;
import java.util.*;
class ZeroCount{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int arr[][]=new int[a][b];
    int i,j;
    for( i=0;i<a;i++){
      for( j=0;j<b;j++){
        arr[i][j]=s.nextInt();
      }
    }
  //maxzerocount in row
  int count=0;
  int Zcount=0;
  int row=0;
  for( i=0;i<a;i++){
    for( j=0;j<b;j++){
      if(arr[i][j]==0){
          count++;
        }

    }
    if(Zcount<count){
      Zcount=count;
      row=i+1;
    }
 count=0;
  }
   //maxzerocount in col
  int f=0;
  int colcount=0;
  int colz=0;
  for( i=0;i<b;i++){
    for( j=0;j<a;j++){
      if(arr[j][i]==0){
        colcount++;

        }
      
    }
    if(colz<colcount){
      colz=colcount;
      f=i+1;
    }
   colcount=0;
  }
  if(row==0){
    System.out.print("-1");
  }
  else{
    System.out.print(row+" ");
  }
   if(f==0){
     System.out.print("-1");
   }
   else{
     System.out.print(f+" ");
   }
}
}
