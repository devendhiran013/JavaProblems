package While;
import java.util.Scanner;

 class NumtoDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int mul = 0, pv = 1, tem = num;

        // Process each digit
        while(tem != 0) {
            int d = tem % 10; // Extract the last digit

            // Replace 0 with 5
            if(d == 0) {
                d = 5;
            }

            // Construct the modified number
            mul = d * pv + mul;
            pv *= 10;
            tem /= 10;
        }
        System.out.println(mul);
    }
}
