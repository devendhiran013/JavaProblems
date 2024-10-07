package Array;
import java.util.Scanner;
public class Knife {
    public static int findSurvivor(int n) {
        int survivor = 0; 
        for (int i = 2; i <= n; i++) {
            survivor = (survivor + 2) % i; 
        }
        return survivor + 1; 
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("T1he survivor is: " + findSurvivor(n));
    }
}
