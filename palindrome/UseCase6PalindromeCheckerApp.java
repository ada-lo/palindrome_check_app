import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "kayak";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        
        // Enqueue & Push characters
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            queue.add(c);
            stack.push(c);
        }
        
        boolean isPalindrome = true;
        
        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}
