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
    
    public boolean validate(TreeNode root, Integer left, Integer right) {
        // base case
        if (root == null) {
            return true;
        }
        
        if ((left != null && root.val <= left) || (right != null && root.val >= right)) {
            return false;
        }
        return validate(root.right, root.val, right) && validate(root.left, left, root.val);
    }
    
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
}