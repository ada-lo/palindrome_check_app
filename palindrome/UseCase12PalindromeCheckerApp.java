import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

// Define PalindromeStrategy interface
interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

// Implement StackStrategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String str) {
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

// Implement DequeStrategy
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context Class
class PalindromeContext {
    private PalindromeStrategy strategy;
    
    // Inject strategy at runtime
    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }
    
    public boolean executeStrategy(String str) {
        return strategy.isPalindrome(str);
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "level";
        
        // Polymorphism & Strategy Pattern Execution
        PalindromeContext context = new PalindromeContext(new StackStrategy());
        System.out.println("Using StackStrategy: The string '" + original + "' is a palindrome? " + context.executeStrategy(original));
        
        context.setStrategy(new DequeStrategy());
        System.out.println("Using DequeStrategy: The string '" + original + "' is a palindrome? " + context.executeStrategy(original));
    }
}
