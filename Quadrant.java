import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>0&&b>0){
            System.out.println("1st Quadrant");
        }
        else if(a<0&&b>0){
            System.out.println("2nd Quadrant");
        }
        else if(a<0&&b<0){
            System.out.println("3rd Quadrant");
        }
        else{
            System.out.println("4th Quadrant");
        }
    }
}
