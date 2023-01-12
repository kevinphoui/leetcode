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
    
    // algorithm
    // have hashset of all numbers
    // return true 
    HashSet<Integer> hash;
    
    public void iterateBST(TreeNode root) {
        if (root.left != null) {
            iterateBST(root.left);
        }
        if (root.right != null) {
            iterateBST(root.right);
        }
        hash.add(root.val);
    }
    
    public boolean findTarget(TreeNode root, int k) {
        hash = new HashSet<>();
        iterateBST(root);
        
        if (hash.size() <= 1) {
            return false;
        }
        
        System.out.println(hash.toString());
        for (Integer key : hash) {
            System.out.println("key - k: " + (k - key));
            if (hash.contains(k - key) && (k - key != key)){
                return true;
            }
        }
        
        return false;
    }
}