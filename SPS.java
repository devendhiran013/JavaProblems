import java.util.Scanner;

public class SPS {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String input=s.nextLine();
       String cas=input.toLowerCase();
       
       if(cas.equals("rock")){
        System.out.println("paper");
       }
       else if(cas.equals("paper")){
        System.out.println("Scissor");
       }
       else if(cas.equals("scissor")){
        System.out.println("Rock");
       }
       else{
        System.out.println("Invalid input");
       }
       
    }
}
