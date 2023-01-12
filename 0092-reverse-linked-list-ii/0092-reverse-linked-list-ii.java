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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Empty List
        if (head == null) {
            return null;
        }
        
        // Move the two pointers until they reach the proper starting point in the list
        ListNode current = head;
        ListNode prev = null;
        
        while (left > 1) { 
            prev = current;
            current = current.next;
            left--;
            right--;
        }
        
        // The two pointers that will fix the final connection
        ListNode con = prev;
        ListNode tail = current;
        
        // Iteratively reverse the nodes until right becomes 0
        ListNode third = null;
        while (right > 0) {
            third = current.next;
            current.next = prev;
            prev = current;
            current = third;
            right--;
        }
        
        // Adjust the final connections as explained in the algorithm
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }
        
        tail.next = current;
        return head;
    }
}