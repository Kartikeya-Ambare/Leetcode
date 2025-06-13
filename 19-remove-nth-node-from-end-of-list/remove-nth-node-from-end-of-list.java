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
        return removeElement(head, n);
    }
    private ListNode removeElement(ListNode currentHead, int n) {
        if (currentHead == null) {
            return null;
        }
        int length = 0;
        ListNode temp = currentHead;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (n == length) {
            return currentHead.next;
        }
        ListNode nodeBeforeTarget = currentHead;
        int stepsToReachNodeBeforeTarget = length - n - 1;

        for (int i = 0; i < stepsToReachNodeBeforeTarget; i++) {
            if (nodeBeforeTarget.next == null) {
                return currentHead;
            }
            nodeBeforeTarget = nodeBeforeTarget.next;
        }

        if (nodeBeforeTarget.next != null) {
            nodeBeforeTarget.next = nodeBeforeTarget.next.next;
        }

        return currentHead;
    }
    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode new_list = head;
        new_list = removeElement(new_list,n,head);
        return new_list;
    }
    private ListNode removeElement(ListNode new_list,int n,ListNode head){
        if(new_list.next == null){
            new_list=new_list.next;
            return new_list;
        }
        if(new_list.next.next == null){
            if(n == 1){
                new_list.next=null;
                return new_list;
            }
            else if(n == 2){
                new_list=new_list.next;
                return new_list;
            }
        }
        if(new_list.next.next.next == null){
            if(n == 1){
                new_list.next.next=null;
                return new_list;
            }
            else if(n == 2){
                new_list.next=new_list.next.next;
                return new_list;
            }
            else if(n == 3){
                new_list=new_list.next;
                return new_list;
            }
        }
        ListNode neww_list = new_list;
        int count = 1;
        while(neww_list!=null){
            count++;
            neww_list=neww_list.next;
        }
        if(count == n){
            new_list=new_list.next;
            return head;
        }
        for(int i = 1;i<count-n-1;i++){
            new_list=new_list.next;
        }
        new_list.next= new_list.next.next;
        return head;
    }*/
    
}