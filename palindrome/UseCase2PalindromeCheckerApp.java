public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("The string '" + word + "' is a palindrome.");
        } else {
            System.out.println("The string '" + word + "' is not a palindrome.");
        }
    }
}
