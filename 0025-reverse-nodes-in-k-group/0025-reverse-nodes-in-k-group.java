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
    // Approach 2: iterative O(1) space
    
    // Algorithm:
    // 1) Assuming we have a reverse() function already defined for a linked list. 
    // This function would take the head of the linked list and also an integer value representing k.
    // We don't have to reverse till the end of the linked list. Only k nodes are to be touched at a time.
    
    // 2) We need to maintain four different variables in this algorithm as we chug along:
        // 1. head ~ which will always point to the original head of the next set of k nodes
        // 2. revHead ~ which is basically the tail node of the original set of  k nodes. Hence, this becomes the new head after reversal
        // 3. ktail ~ is the tail node of the previous set of k nodes after reversal.
        // 4. newHead ~ acts as the head of the final list that we need to return as the output. 
        //  Basically, this is the kth node from the beginning of the original list.
    
    // 3) The core algorithm remains the same as before. Given the head, we first count k nodes.
    // if we are able to find at least k nodes, we reverse them and get out revHead.
    
    // 4) At this point we check if we already have the variable ktail set or not. It won't be set when we reverse the very first set of k nodes.
    // However if this variable is set, then we attach ktail.next to the revHead. Also, we need to update ktail to point to the tail
    // of the reversed set of k nodes that we just processed.
    // Remember, the head node becomes the new tail and hence, we set ktail = head.
    
    // 5) We keep doing this until we reach the end of the list or we encounter that there are < k nodes left in the list.
    
    public ListNode reverseLinkedList(ListNode head, int k) {
        // Reverse k nodes of the given linked list.
        // This function assumes that the list contains atleast k nodes
        ListNode new_head = null;
        ListNode ptr = head;
        
        while (k > 0) {
            
            // Keep track of the next node to the process in the original list
            ListNode next_node = ptr.next;
            
            // Insert the nodes pointed to by "ptr" at the beginning of the reversed list
            ptr.next = new_head;
            new_head = ptr;
            
            // Move on to the next node
            ptr = next_node;
            
            // Decrement the count of nodes to be reversed by 1
            k--;
        }
        // return the head of the reversed list
        return new_head;
        
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ptr = head;
        ListNode ktail = null;
        
        // Head of the final, motified linked list
        ListNode new_head = null;
        
        // Keep going until there are nodes in the lsit
        while (ptr != null) {
            int count = 0;
            // Start counting nodes from the head
            ptr = head;
            
            // Find the head of the next k nodes
            while (count < k && ptr != null) {
                ptr = ptr.next;
                count += 1;
            }
            
            if (count == k) {
                
                // Reverse k nodes and get the new head
                ListNode revHead = this.reverseLinkedList(head, k);
                
                // new_head is the head of the final linked list
                if (new_head == null) {
                    new_head = revHead;
                }
                
                // ktail is the tail of the previous block of reversed k nodes
                if (ktail != null) {
                    ktail.next = revHead;
                }
                ktail = head;
                head = ptr;
            }
        }
        
        // attach the final, possibly un-reversed portion
        if (ktail != null) {
            ktail.next = head;
        }
        
        return new_head == null ? head : new_head;
    }
}