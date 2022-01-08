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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge;
        
        
        // base case
        if (list1 == null && list2 == null){
            return null;
        }
        if (list1 != null && list2 == null){
            return list1;
        }
        if (list1 == null && list2 != null){
            return list2;
        }
        
        
        // recursive case
        // if list1 is less than list2, adds list1 & list.next, else adds list2 & list2.next
        if (list1.val < list2.val){
            merge = list1;
            merge.next = mergeTwoLists(list1.next, list2);
        } else {
            merge = list2;
            merge.next = mergeTwoLists(list1, list2.next);
        }

        return merge;
    }
}