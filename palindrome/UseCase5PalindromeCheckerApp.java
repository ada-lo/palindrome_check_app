import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "radar";
        Stack<Character> stack = new Stack<>();
        
        // Push Operation
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }
        
        // Pop Operation & Reversal Logic
        String reverse = "";
        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }
        
        if (original.equals(reverse)) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}
