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
    // approach: reverse input + construct output by adding to front
    // implement reverseList function  
    
    public ListNode reverseList(ListNode list) {
        ListNode prev = null;
        ListNode curr = list;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // reverse both input lists
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        
        // initialize the result list: head = none
        ListNode head = null;
        // initialize the carry: carry = 0;
        int carry = 0;
            
        // loop through l1 and l2 until you reach both ends
        while (l1 != null || l2 != null) {
            int x1 = 0;
            int x2 = 0;
            // set x1 = l1.val if l1 is not finished yet, and x1 = 0 otherwise
            if (l1 != null) {
                x1 = l1.val;
            }
            // set x2 = l2.val if l2 is not finished yet, and x2 = 0 otherwise
            if (l2 != null) {
                x2 = l2.val;
            }
            
            // compute the current value: val = (carry + x1 + x2) % 10, 
            int val = (carry + x1 + x2) % 10;
            // and the current carry: carry = (carry + x1 + x2) / 10
            carry = (carry + x1 + x2) / 10;
            
            // update the result by adding the current value to front
            ListNode curr = new ListNode(val);
            // move to the next element in the list
            curr.next = head;
            head = curr;
            
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // if the carry is not equal to zero, append it to the front of the result list
        if (carry != 0) {
            ListNode curr = new ListNode(carry);
            curr.next = head;
            head = curr;
        }
                
        // return the result list: return head;
        return head;
    }
}