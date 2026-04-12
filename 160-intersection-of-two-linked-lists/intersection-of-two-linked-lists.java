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
        ListNode a1 = headA;
        ListNode a2 = headB;

        while(a1!=a2){
            a1 = a1 == null?headB:a1.next;
            a2 = a2 == null?headA:a2.next;
        }
        return a1;

    }
}