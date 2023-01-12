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
    
    public boolean isMirror(TreeNode leftHalf, TreeNode rightHalf) {
        // if both are empty, we are at the end of the tree
        if (leftHalf == null && rightHalf == null) {
            return true;
        }
        // if one of them is null but the other isn't, it is not symmetric
        if (leftHalf == null || rightHalf == null) {
            return false;
        }
        
        return (leftHalf.val == rightHalf.val) && isMirror(leftHalf.left, rightHalf.right) && isMirror(leftHalf.right, rightHalf.left);
    }
    
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
}