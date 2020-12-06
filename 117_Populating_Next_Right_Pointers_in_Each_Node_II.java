/*
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        if( root == null ){
            return null;
        }
        q.add(root);
        BFS(q);
        return root;
    }
    
    public void BFS( Queue<Node> q ){
        while( !q.isEmpty() ){
            int size = q.size();
            while( size > 0 ){
                Node curr = q.poll();
                if( size == 1 ){
                    curr.next = null;
                    size--;
                }else{
                    curr.next = q.peek();
                    size--;
                }
                if( curr.left != null ){
                    q.add(curr.left);
                }
                if( curr.right != null ){
                    q.add(curr.right);
                }
            }
            
        }
    }
}