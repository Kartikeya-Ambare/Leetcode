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
    public int length(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    // Standard reverse for the whole list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int len = length(head);
        k = k % len;
        if (k == 0) return head;

       
        head = reverse(head);

        ListNode head1 = head;
        ListNode temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        ListNode head2 = temp.next; 
        temp.next = null;           
        head1 = reverse(head1);
        head2 = reverse(head2);

        ListNode current = head1;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head2;

        return head1;
    }
}