package Number;
import java.util.*;
class soft{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++)
    {
        arr[i]=sc.nextInt();
    }
    int b=sc.nextInt();
    int arrr[]=new int[b];
    for(int j=0;j<b;j++)
    {
        arrr[j]=sc.nextInt();
    }
    int sum=0;
    int pos=0;
    int temp=0;
    for(int i=0;i<b;i++)
    {
        for(int j=0;j<a;j++)
        {
            
            if(arrr[i]==arr[j])
            {
                temp=pos-j;
                if(temp<0)
                {
                    temp*=-1;
                }
                sum+=temp;
                pos=j;
            }
        }
    }
    System.out.println(sum);
}
}