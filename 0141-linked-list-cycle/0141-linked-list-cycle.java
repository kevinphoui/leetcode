/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> unique = new HashSet<>();
        
        while (head != null){
            if (!unique.add(head)){
                return true;
            }
            head = head.next;
        }
        
        return false;
    }
}