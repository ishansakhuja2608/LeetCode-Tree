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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root == null) {
            return false;
        }
        
        // If the starting root matches
        else if(isSameTree(root, subRoot)) {
            return true;
        }
        
        // Check if the left or right root matches with the root of the subtree
        else {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }
    
    private boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null)
            return root == null && subRoot == null; // if both null, then true
        
        // moveing down the other roots
        else if(root.val == subRoot.val) 
            return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
        
        
        else 
            return false;
        
    }
}