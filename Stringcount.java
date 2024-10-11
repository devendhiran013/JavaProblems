import java.util.Scanner;

public class Stringcount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int ccount = 0, lcount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                ccount++;
            } else if (c >= 'a' && c <= 'z') {
                lcount++;
            }
        }
        char aChar;
        String str1="";
         if(ccount<lcount) {
            for (int i = 0; i < str.length(); i++) {

                aChar = str.charAt(i);

               str1 += (char)((aChar + 32))+"";

              
            
        }
        System.out.println(str1.toString());
        
    }
    }

}
