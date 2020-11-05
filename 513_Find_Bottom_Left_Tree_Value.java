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
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if( root == null ){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        return BFS(l, q);
    }
    
    public int BFS(List<Integer> l, Queue<TreeNode> q){
        while( !q.isEmpty() ){
            int size = q.size();
            for(int i = 0; i<size; i++){
                TreeNode n = q.poll();
                if( i == 0 ){
                    l.add(n.val);
                }
                if( n.left != null ){
                    q.add(n.left);
                }
                if( n.right != null ){
                    q.add(n.right);
                }
            }    
        }
        return l.get( l.size() - 1 );
    }
    
}