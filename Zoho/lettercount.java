

import java.util.Scanner;


public class lettercount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch=str.charAt(i);
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (ch== str.charAt(j)) {
                    count++;
                }
                
            }
            if (str.indexOf(ch) == i) { 
                System.out.print(ch + " -> " + count);
            }
            
        }
    }
}
