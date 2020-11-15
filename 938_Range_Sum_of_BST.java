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
    int ans;
    public int rangeSumBST(TreeNode root, int L, int R) {
        int ans = 0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (L <= node.val && node.val <= R)
                    ans += node.val;
                if (L < node.val)
                    stack.push(node.left);
                if (node.val < R)
                    stack.push(node.right);
            }
        }
        return ans;
        
        // int ans = 0;
        // sum(root, low, high);
        // return ans;
    }
    public void sum(TreeNode root, int l, int h){
        while( root != null ){
            if( root.val >= l && root.val <= h ){
                ans += root.val;
            }
            if( l < root.val ) {
                sum( root.left, l, h );
            }
            if( h > root.val ){
                sum( root.right, l, h );
            }
        }
    }
}