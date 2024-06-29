import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=10;
        while(t>=5){
        System.out.println("total " +t);
        System.out.print("Enter no.of.Candies to buy");
        int Buy=s.nextInt();
        t=t-Buy;
        if(t>=5){
            System.out.println("Thank you for buy");
            System.out.println("Remaider candies"+t);

        } 
        else{
            System.out.println("Candies out of stock");
        }
    }
}
}