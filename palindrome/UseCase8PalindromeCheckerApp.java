public class UseCase8PalindromeCheckerApp {
    
    static class ListNode {
        char val;
        ListNode next;
        ListNode(char x) { val = x; }
    }

    public static void main(String[] args) {
        String original = "rotor";
        
        // Convert string to linked list
        ListNode head = new ListNode(original.charAt(0));
        ListNode current = head;
        for (int i = 1; i < original.length(); i++) {
            current.next = new ListNode(original.charAt(i));
            current = current.next;
        }
        
        // Fast and Slow Pointer to find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Reverse second half in-place
        ListNode prev = null;
        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        
        // Compare halves
        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        boolean isPalindrome = true;
        
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        if (isPalindrome) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}
