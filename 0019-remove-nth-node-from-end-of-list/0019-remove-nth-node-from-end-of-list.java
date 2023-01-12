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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        
        // find length of list
        ListNode findLength = head;
        int length = 0;
        while (findLength != null) {
            findLength = findLength.next;
            length++;
        }
        
        // step back one
        length -= n;    // length = the nth node from the end of the list
        first = dummy;
        // iterate to find the n - 1th node
        while (length > 0) {
            first = first.next;
            length--;
        }
        
        first.next = first.next.next; // remove the nth node
        return dummy.next;
    }
}