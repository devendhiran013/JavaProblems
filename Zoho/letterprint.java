package Zoho;

import java.util.Scanner;

public class letterprint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String ch ="";

        String num = "";
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            if (chr >= 'a' && chr <= 'z') {
                ch += chr;
            }
            if (chr >= '1' && chr <= '9') {
                num += chr;
            }
            while (i + 1 < str.length() && str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9') {
                i++;
                num += str.charAt(i);

            }

        
        if (!num.isEmpty()) {
            int n = Integer.parseInt(num);
            for (int j = 0; j < n; j++) {
                System.out.print(ch);
            }
            num = "";
            ch="";
        }}
    }

}
