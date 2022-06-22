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
    // Run time -> O(n)
    public boolean isSymmetric(TreeNode root) {
        // Base case 
        if(root == null)
            return true;
        
        return isSymmetric(root.left, root.right);
    }
    
    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null || right == null) 
            return left == null && right == null;
        
        if(left.val != right.val)
            return false; // If the values are not the same
        
        // We have to check the left of the left with the right of the right && 
        // right of the left with left of the right
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
