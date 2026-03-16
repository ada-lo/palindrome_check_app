import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "deified";
        Deque<Character> deque = new LinkedList<>();
        
        // Insert characters into deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }
        
        boolean isPalindrome = true;
        
        // Remove first & last and Compare until > 1
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            
            if (first != last) {
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
