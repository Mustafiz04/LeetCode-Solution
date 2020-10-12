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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lot = new ArrayList<>();
        
        if( root == null ){
            return lot;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int nodesAtCurrentLevel = 1;
        int nodesAtNextLevel = 0;
        
        List<Integer> levelNode = new ArrayList<>();
        
        while( !q.isEmpty() ){
            TreeNode curr = q.poll();
            nodesAtCurrentLevel -= 1;
            
            levelNode.add( curr.val );
            
            if( curr.left != null ){
                q.add(curr.left);
                nodesAtNextLevel++;
            }
            if( curr.right != null ){
                q.add(curr.right);
                nodesAtNextLevel++;
            }
            
            if( nodesAtCurrentLevel == 0 ){
                lot.add( levelNode );
                levelNode = new ArrayList<>();
                nodesAtCurrentLevel = nodesAtNextLevel;
                nodesAtNextLevel = 0;
            }
        }
        return lot;
    }
}