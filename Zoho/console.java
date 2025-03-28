import java.util.*;

class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        sc.close();

        String words[] = sentence.split(" ");
        int n = words.length;

        List<String> reversedWords = new ArrayList<>();
        List<String> originalWords = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (n % 2 == 0) { // Even number of words → Reverse even positions
                if ((i + 1) % 2 == 0) {
                    System.out.print(reverseString(words[i]));
                } else {
                    originalWords.add(words[i]);
                }
            } else { 
                if ((i + 1) % 2 == 1) {
                    reversedWords.add(reverseString(words[i]));
                } else {
                    originalWords.add(words[i]);
                }
            }
        }

        // Joining reversed words first, then original words
        for (int i=reversedWords.size()-1;i>=0;i--) {
            System.out.print(reversedWords.get(i) + " ");
        }
        for (int i = 0; i < originalWords.size(); i++) {
            System.out.print(originalWords.get(i));
            if (i < originalWords.size() - 1) {
                System.out.print(" ");
            }
        }
    }

    static String reverseString(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }
        return temp;
    }
}
