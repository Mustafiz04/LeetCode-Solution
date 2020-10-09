/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowP = head;
        ListNode fastP = head;
        boolean flag = false;
        
        while( slowP != null && fastP != null && fastP.next != null ){
            slowP = slowP.next;
            fastP = fastP.next.next;
            
            if( slowP == fastP ){
                flag = true;
                break;
            }
        }
        
        return flag;
    }
}