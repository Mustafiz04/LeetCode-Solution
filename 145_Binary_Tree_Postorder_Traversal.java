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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        // postorder( root, l );
        // return l;
        
        if( root == null ){
            return l;
        }
        
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.add( root );
        
        while( !s1.isEmpty() ){
            TreeNode curr = s1.pop();
            s2.add(curr);
            if( curr.left != null ){
                s1.add(curr.left);
            }
            if( curr.right != null ){
                s1.add(curr.right);
            }
        }
        
        while( !s2.isEmpty() ){
            l.add(s2.pop().val);
        }
        return l;
    }
    // public void postorder( TreeNode root, List<Integer> l ){
    //     if( root == null ){
    //         return;
    //     }
    //     postorder(root.left, l);
    //     postorder(root.right, l);
    //     l.add(root.val);
    // }
}