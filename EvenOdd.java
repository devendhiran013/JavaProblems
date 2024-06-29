import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a=s.nextInt();
       
        if(a %2==0){
            System.out.println(" Given Number is Even");
        }
        else{
            System.out.println("Given number is Odd");
        }


    }
}
