public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "A man a plan a canal Panama";
        
        // String preprocessing & Regular expressions
        String normalized = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Apply previous logic (Two-pointer technique)
        char[] charArray = normalized.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;
        
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        
        if (isPalindrome) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}
