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
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> s = new Stack<>();
        ListNode curr =  head;
        
        while( curr != null ){
            s.add(curr);
            curr = curr.next;
        }
        ListNode c = head;
        
        while( !s.isEmpty() ){
            ListNode pop = s.pop();
            if( c.val != pop.val ){
                return false;
            }
            c = c.next;
        }
        return true;
    }
}