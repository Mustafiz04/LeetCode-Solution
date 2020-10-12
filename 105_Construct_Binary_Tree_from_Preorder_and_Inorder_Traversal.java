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
    private int preIndex = 0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        TreeNode c = tree( preorder, inorder, 0, n-1 );
        return c;
    }
    public TreeNode tree(int[] pre, int[] in, int s, int l ){
        if( s > l ) {
            return null;
        }
        TreeNode curr = new TreeNode( pre[preIndex++] );
        
        if( s == l ){
            return curr;
        }
        int index = search( in, s, l, curr.val );
        
        curr.left = tree( pre, in, s, index - 1 );
        curr.right = tree(pre, in, index+1, l );
        
        return curr;
    }
    public int search( int[] inorder, int s, int l, int k ){
        int i;
        for(i = s; i<=l; i++){
            if( inorder[i] == k ){
                return i;
            }
        }
        return i;
    }
}