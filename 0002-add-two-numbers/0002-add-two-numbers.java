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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode start = new ListNode(0);   // the start of ans, to returned
        ans = start;    // set ans to start
        int carry = 0;  // carry that will be calculated and returned to the next int
        // while no remainders on l1 or 2, and no carry left to add
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            ans.next = new ListNode(carry%10);
            carry /= 10;
            ans = ans.next;
        }
        
        
        return start.next;
    }
}