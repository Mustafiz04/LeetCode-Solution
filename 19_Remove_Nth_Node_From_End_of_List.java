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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        int len = 0;
        
        while( curr != null ){
            len++;
            curr = curr.next;
        }
        
        len -= n;
        curr = dummy;
        while( len > 0 ){
            curr = curr.next;
            len--;
        }
        
        curr.next = curr.next.next;
        
        return dummy.next;
        
    }
}