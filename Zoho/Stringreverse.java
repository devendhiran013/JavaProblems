public class Stringreverse {
    public static String reverseWordsAtPositions(String input) {
        // Split the string into words
        String[] words = input.split(" ");
        int n = words.length;
        
        // Determine if the number of words is even or odd
        boolean isEven = (n % 2 == 0);

        // Process the words
        for (int i = 0; i < n; i++) {
            // If even number of words, reverse words at even positions
            // If odd number of words, reverse words at odd positions
            if ((isEven && i % 2 == 0) || (!isEven && i % 2 != 0)) {
                words[i] = reverseString(words[i]);
            }
        }

        // Build the new string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(words[i]);
            if (i < n - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Helper method to reverse a word
    private static String reverseString(String word) {
        StringBuilder reversed = new StringBuilder(word);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "Rohit Sharma Virat Kohli KL Rahul";
        String input2 = "Rohit Sharma Virat Kohli KL Rahul Dhoni";

        System.out.println(reverseWordsAtPositions(input1)); // Output: luhar ilhok amrahs Rohit Virat KL
        System.out.println(reverseWordsAtPositions(input2)); // Output: inohD LK tariv tihoR Sharma Kohli Rahul
    }
}