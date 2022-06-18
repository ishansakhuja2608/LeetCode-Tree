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
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return res;
    }
    private int height(TreeNode root) { // calcuate the left and right height at every node
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left); // for left subtree
        int rightHeight = height(root.right); // for right subtree
        
        res = Math.max(res, leftHeight + rightHeight); // update the result as the addition of both the height
        
        return Math.max(rightHeight, leftHeight) + 1; // return the height
    }
}