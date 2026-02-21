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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        // ListNode prev = dummy;
        
        // for(int i = 0; i < left - 1; i++)
        //     prev = prev.next;
        
        // ListNode curr = prev.next;
        // for(int i = 0; i < right - left; i++){
        //     ListNode forw = curr.next;
        //     curr.next = forw.next;
        //     forw.next = prev.next;
        //     prev.next = forw;
        // }
        // return dummy.next;

        Stack<Integer> s = new Stack<>();
        ListNode ptr = head;
        int count = 1;
        ListNode ptr2 = null;

        while(ptr != null){
            if(count == left){
                ptr2 = ptr;
                while(count <= right){
                    s.push(ptr.val);
                    count++;
                    ptr = ptr.next;
                }

                while(!s.isEmpty()){
                    int n = s.pop();
                    System.out.print(n);
                    ptr2.val = n;
                    ptr2 = ptr2.next;
                }
                break;
            }else{
                ptr = ptr.next;
                count++;
            }
        }

        return head;
    }
}