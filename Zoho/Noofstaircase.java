

public class Noofstaircase {
    public static void main(String[] args) {
        int a=5;
        int count=0,flag=1;
        for(int i=1;i<=a;i++){
            count=flag;
            for(int j=1;j<=a;j++){
                if(count>a){
                    count=1;
                }
                System.out.print(count+" ");
                count++;
            }
            flag++;
            System.out.println();
        }
    }
}
