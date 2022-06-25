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
    /*
    While inorder traversal of the BST, check whether the difference of the sum and current val is present in the hashset, if yes, return true,
    otherwise add that particular value to the set and call for right child
    */
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> s = new HashSet<>();
        return isPairSum(root, k, s);
    }
    
    private boolean isPairSum(TreeNode root, int sum, HashSet<Integer> s) {
        if(root == null)
            return false;
        if(isPairSum(root.left, sum, s))
            return true;
        if(s.contains(sum - root.val))
            return true;
        else
            s.add(root.val);
        return isPairSum(root.right, sum, s);
    }
}
