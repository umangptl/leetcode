package solution;

public class PalindromeLinkedList {


    // Method to check if a linked list is a palindrome
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node is considered a palindrome
        }

        ListNode firstHalfEnd = findFirstHalfEnd(head); // Find the end of the first half of the linked list
        ListNode secondHalfStart = reverseLinkedList(firstHalfEnd.next); // Reverse the second half of the linked list

        ListNode p1 = head; // Pointer for the first half
        ListNode p2 = secondHalfStart; // Pointer for the reversed second half

        while (p2 != null) {
            if (p1.val != p2.val) {
                return false; // If the values at corresponding positions are not equal, it's not a palindrome
            }
            p1 = p1.next; // Move the first half pointer forward
            p2 = p2.next; // Move the reversed second half pointer forward
        }

        return true; // All values matched, so it's a palindrome
    }

    // Method to find the end of the first half of the linked list using slow and fast pointers
    private ListNode findFirstHalfEnd(ListNode head) {
        ListNode slow = head; // Slow pointer moves one node at a time
        ListNode fast = head; // Fast pointer moves two nodes at a time

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next; // Move the slow pointer one step forward
            fast = fast.next.next; // Move the fast pointer two steps forward
        }

        return slow; // Return the slow pointer, which points to the end of the first half
    }

    // Method to reverse a linked list
    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null; // Previous pointer initially points to null
        ListNode curr = head; // Current pointer starts from the head of the linked list

        while (curr != null) {
            ListNode next = curr.next; // Temporary pointer to store the next node
            curr.next = prev; // Reverse the current node by pointing it to the previous node
            prev = curr; // Move the previous pointer to the current node
            curr = next; // Move the current pointer to the next node
        }

        return prev; // Return the new head of the reversed linked list
    }

    // Definition of the ListNode class representing a node in the linked list
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
      ListNode() {}
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
