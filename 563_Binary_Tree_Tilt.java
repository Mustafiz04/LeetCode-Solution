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
    public int totalSum = 0;
    
    public int findTilt(TreeNode root) {
        sum(root);
        return totalSum;
        
    }
    
    public int sum(TreeNode root){
        if( root == null ){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        int tilt = Math.abs(leftSum - rightSum);
        
        totalSum += tilt;
            
        return root.val + leftSum + rightSum;
    }
}
