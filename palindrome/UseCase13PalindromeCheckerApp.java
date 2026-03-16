public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "A man a plan a canal Panama".replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        System.out.println("Performance Comparison:");
        
        // Approach 1: String Reverse (StringBuilder)
        long startTime = System.nanoTime();
        String reversed = new StringBuilder(original).reverse().toString();
        boolean res1 = original.equals(reversed);
        long endTime = System.nanoTime();
        System.out.println("String Builder Reverse Time: " + (endTime - startTime) + " ns");

        // Approach 2: Two-Pointer with char array
        startTime = System.nanoTime();
        char[] charArray = original.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        boolean res2 = true;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                res2 = false;
                break;
            }
            start++;
            end--;
        }
        endTime = System.nanoTime();
        System.out.println("Two-Pointer (char[]) Time: " + (endTime - startTime) + " ns");
    }
}
