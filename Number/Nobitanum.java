package Number;
import java.util.Scanner;

public class Nobitanum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int end = s.nextInt();
        int sum = 0;
        for (int i = a; i <= end; i++) {
            if (nobita(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean nobita(int a) {
        boolean k = true;
        int prev = a % 10, sum = 0;
        a /= 10;

        while (a != 0) {

            int curent = a % 10;
            if (Math.abs(curent - prev) != 1) {
                k = false;
            }
            prev = curent;
            a /= 10;
        }
        return true;

    }

}
