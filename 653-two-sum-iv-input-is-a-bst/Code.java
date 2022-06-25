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
    Create an array List, use inorder traversal to add elements in the list in sorted order, use binary search to check
    */
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        treeToList(root, list); // inorder traversal
        int start = 0;
        int end = list.size()-1;
        
        while(start < end) {
            if(list.get(start) + list.get(end) == k)
                return true;
            if(list.get(start) + list.get(end) < k)
                start++;
            else
                end--;
        }
        return false;
    }
    
    public void treeToList(TreeNode root, List<Integer> nums) {
        if(root == null)
            return;
        treeToList(root.left, nums);
        nums.add(root.val);
        treeToList(root.right, nums);
    }
}
