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
    public int maxAncestorDiff(TreeNode root) {
        if( root == null ){
            return 0;
        }
        return maxDiff( root, root.val, root.val );
    }
    
    public int maxDiff(TreeNode root, int min, int max){
        if( root == null ){
            return max - min;
        }
        
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        
        int left = maxDiff( root.left, min, max );
        int right = maxDiff(root.right, min, max);
        
        return Math.max(left, right);
    }
}