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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                //cycle
                if(slow == head){
                    return slow;
                }else{
                    fast=head;
                    while(slow.next != fast.next){
                        fast = fast.next;
                        slow = slow.next;
                    }
                    return slow.next;
                }
            }
        }
        return null;
    }
}