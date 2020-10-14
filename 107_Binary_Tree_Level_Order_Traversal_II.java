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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lot = new ArrayList<>();
        
        if( root == null ){
            return lot;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while( !q.isEmpty() ){
            int n = q.size();
            List<Integer> currentLevel = new ArrayList<>();
            
            for(int i = 0; i<n; i++){
                TreeNode curr = q.poll();
                currentLevel.add( curr.val );
                
                if(curr.left != null ){
                    q.add(curr.left);
                }
                if(curr.right != null ){
                    q.add(curr.right);
                }
            }
            
            lot.add(currentLevel);
        }
        Collections.reverse(lot);
        return lot;
        
    }
}