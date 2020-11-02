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
    public ListNode insertionSortList(ListNode head) {
        ListNode ph = new ListNode();
        ListNode curr = head, pn, nn;
        
        while(curr != null){
            pn = ph;
            nn = ph.next;
            
            while( nn != null ){
                if( curr.val < nn.val ){
                    break;
                }
                pn = nn;
                nn = nn.next;
            }
            ListNode ni = curr.next;
            curr.next = nn;
            pn.next = curr;
            
            curr = ni;
        }
        return ph.next;
    }
}