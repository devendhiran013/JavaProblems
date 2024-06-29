import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x[] = new int[n];
        int temp = 0;
        for (int i = 0; i < n; i++) {

            x[i] = s.nextInt();

        }
        System.out.println("Enter no to search");
        int a = s.nextInt();
        for (int j = 1; j < n; j++) {
            if (x[j] == a) {
                temp = 1;
            }

        }
        if (temp == 1) {

            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }

}
