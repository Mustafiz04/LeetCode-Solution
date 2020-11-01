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
    boolean swapped = true;
    public void recoverTree(TreeNode root) {
        while(swapped) {
            swapped = false;
            dfs(root, null, null);
        }
    }
    
    public void dfs(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return;
        }
        
        if(max != null) {
            if (root.val > max.val) {
                swapped = swapped || true;
                swap(root, max);   
            }
        }
        
        if(min != null) {
            if(root.val < min.val) {
                swapped = swapped || true;
                swap(root, min);
            }
        }
        
        dfs(root.left, min, root);
        dfs(root.right, root, max);
        
    }
    
    private void swap(TreeNode a, TreeNode b) {
        int tmp = a.val;
        a.val = b.val;
        b.val = tmp;
    }
}