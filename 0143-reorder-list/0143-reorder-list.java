/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        // edge case
        if (head == null) {
            return;
        }
        
        // find middle of list using turtle and rabbit
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // reverse the 2nd half of the list
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode temp = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        // merge the two lists
        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        while (secondHalf.next != null) {
            // increment first half
            ListNode temp = firstHalf.next;
            firstHalf.next = secondHalf;
            firstHalf = temp;
            
            // increment second half
            temp = secondHalf.next;
            secondHalf.next = firstHalf;
            secondHalf = temp;
        }
    }
}