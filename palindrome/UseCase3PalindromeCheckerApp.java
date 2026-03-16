public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "racecar";
        String reverse = "";
        
        // Loop used to iterate through characters in reverse
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation (+) used to build reversed string
            reverse += original.charAt(i);
        }
        
        // equals() method to compare content
        if (original.equals(reverse)) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}
