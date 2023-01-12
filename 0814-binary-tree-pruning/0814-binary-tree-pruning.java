/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        return containsOne(root) ? root : null;
    }
    
    public boolean containsOne(TreeNode node) {
        if (node == null) {
            return false;
        }
        
        // check if any node in the left substring contains a 1
        boolean leftContainsOne = containsOne(node.left);
        // if the left substring does not contain a 1, prune the subtree
        if (!leftContainsOne) {
            node.left = null;
        }
        
        // check if any node in the right substring contains a 1
        boolean rightContainsOne = containsOne(node.right);
        // if the right substring does not contain a 1, prune the subtree
        if (!rightContainsOne) {
            node.right = null;
        }
        
        return node.val == 1 || leftContainsOne || rightContainsOne;
        
    }
}