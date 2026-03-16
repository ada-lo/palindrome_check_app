public class UseCase9PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "civic";
        
        boolean isPalindrome = isPalindromeRecursive(original, 0, original.length() - 1);
        
        if (isPalindrome) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
    
    // Recursive Palindrome Checker
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base Condition
        if (start >= end) {
            return true;
        }
        
        // Compare start & end characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}
