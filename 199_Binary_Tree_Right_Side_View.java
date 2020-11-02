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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if( root == null ){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        BFS(q, result);
        return result;
    }
    
    public void BFS(Queue<TreeNode> q, List<Integer> res){
        while( !q.isEmpty() ){
            int size = q.size();
            for(int i = 0; i<size; i++){
                TreeNode node = q.poll();
                if( i == size-1 ){
                    res.add(node.val);
                }
                if( node.left != null ){
                    q.add(node.left);
                }
                if( node.right != null ){
                    q.add(node.right);
                }
            }
        }
    }
    
}