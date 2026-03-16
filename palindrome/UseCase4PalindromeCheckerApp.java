public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "level";
        
        // Convert string to char[]
        char[] charArray = original.toCharArray();
        
        // Two-Pointer Technique
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;
        
        // Time Complexity Awareness: O(n/2) comparisons, no extra string objects
        while (start < end) {
            // Compare start & end characters
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
