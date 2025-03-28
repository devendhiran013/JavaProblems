package Zoho;
import java.util.*;

class console{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        sc.close();

        String words[] = sentence.split(" ");
        int n = words.length;
        
        for (int i = 0; i < n; i++) {
            if (n % 2 == 0) {  // Even number of words, reverse even positions
                if ((i + 1) % 2 == 0) {
                    words[i] = reverseString(words[i]);
                }
            } else {  // Odd number of words, reverse odd positions
                if ((i + 1) % 2 == 1) {
                    words[i] = reverseString(words[i]);
                }
            }
        }
        
        System.out.println(String.join(" ", words));
    }

    static String reverseString(String str) {
        String temp=" ";
        for(int i=str.length();i>=0;i--){
            temp+=str.charAt(i);
        }
        return temp;
}
}