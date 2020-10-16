/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> node_val = new ArrayList<>();
        
        ListNode currNode = head;
        while(currNode != null){
            node_val.add(currNode.val);
            currNode = currNode.next;
        }
        
        int[] ans = new int[node_val.size()];
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i<node_val.size(); i++){
            while( !s.isEmpty() && node_val.get( s.peek()) < node_val.get(i) ){
                ans[s.pop()] = node_val.get(i);
            }
            
            s.add(i);
        }
        
        return ans;
    }
}