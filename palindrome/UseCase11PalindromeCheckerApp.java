import java.util.Stack;

class PalindromeChecker {
    // Encapsulation: method contains the logic
    public boolean checkPalindrome(String str) {
        if (str == null) return false;
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        
        return str.equals(reversed);
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "level";
        
        // Single Responsibility Principle
        PalindromeChecker checker = new PalindromeChecker();
        boolean isPalindrome = checker.checkPalindrome(original);
        
        if (isPalindrome) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}
