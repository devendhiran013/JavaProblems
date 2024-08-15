package DataStructure.Stack.ExpressionEvaluation;

import java.util.Scanner;
import java.util.Stack;

class balancingparan {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }

            else {
                return false;
            }
            System.out.println(stack);
        }
       
        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        balancingparan solution = new balancingparan();
        Scanner s = new Scanner(System.in);
        String sc = s.nextLine();
        
        System.out.println(solution.isValid(sc)); 
        s.close();
    }
}
