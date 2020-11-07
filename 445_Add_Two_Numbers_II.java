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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if( l1.val == 0 ){
            return l2;
        }
        if( l2.val == 0 ){
            return l1;
        }
        
        
        ListNode h1 = reverse(l1);
        ListNode h2 = reverse(l2);
        
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        
        int carry = 0;
        while( h1 != null && h2 != null ){
            int sum = h1.val + h2.val + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10 );
            curr = curr.next;
            h1 = h1.next;
            h2 = h2.next;
        }
        while( h1 != null ){
            int sum = h1.val + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10 );
            curr = curr.next;
            h1 = h1.next;
        }
        while( h2 != null ){
            int sum = h2.val + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10 );
            curr = curr.next;
            h2 = h2.next;
        }
        if( carry != 0 ){
            curr.next = new ListNode( carry );
        }
        return reverse(temp.next);
    }
    
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        
        while( curr != null ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
}