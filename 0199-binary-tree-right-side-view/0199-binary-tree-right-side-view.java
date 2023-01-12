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
    
    List<Integer> rightSide = new ArrayList<>();
    
    
    public void rightTree(TreeNode root, int level) {
        if (level == rightSide.size()) {
            rightSide.add(root.val);
        }
        if (root.right != null) {
            rightTree(root.right, level + 1);
        }
        if (root.left != null) {
            rightTree(root.left, level +1);
        }
    }
        
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return rightSide;
        }
        
        rightTree(root, 0);
        
        
        return rightSide;
    }
}