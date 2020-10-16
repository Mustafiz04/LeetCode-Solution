/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = count(headA);
        int b = count(headB);
        int d = 0;
        ListNode intersection = null;
        
        if( a > b ){
            d = a - b;
            intersection = intersectionNode(headA, headB, d);
        }else{
            d = b - a;
            intersection = intersectionNode(headB, headA, d);
        }
        return intersection;
        
    }
    
    public ListNode intersectionNode(ListNode headA, ListNode headB, int d){
        ListNode a = headA;
        ListNode b = headB;
        for(int i = 0; i<d; i++){
            if( a == null ){
                return null;
            }
            a = a.next;
        }
        while( a != null && b != null ){
            if( a == b ){
                return a;
            }
            a = a.next;
            b = b.next;
        }
        return null;
    }
    
    public int count(ListNode node){
        int count = 0;
        while( node != null){
            count++;
            node = node.next;
        }
        return count;
    }
}