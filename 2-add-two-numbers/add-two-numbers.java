import java.math.BigInteger;
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
       StringBuilder s1 = new StringBuilder();
        ListNode temp1 = l1;
        StringBuilder s2 = new StringBuilder();
        ListNode temp2 = l2;
        
        // Fix 1: Use temp1.val and temp2.val instead of l1.val/l2.val
        while(temp1 != null){
            s1.append(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            s2.append(temp2.val);
            temp2 = temp2.next;
        } 
        
        // Fix 2: Use BigInteger because input lists can exceed 100 digits (overflows int/long)
        BigInteger num1 = new BigInteger(s1.reverse().toString());
        BigInteger num2 = new BigInteger(s2.reverse().toString());
        BigInteger sum = num1.add(num2);
        
        // Fix 3: Process the sum string
        String ans = sum.toString();
        
        // Fix 4: Correctly link nodes. 
        // Since the list represents digits in reverse order, we iterate the string backwards.
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int i = ans.length() - 1; i >= 0; i--){
            curr.next = new ListNode(Character.getNumericValue(ans.charAt(i)));
            curr = curr.next;
        }
        
        return dummy.next;
    }
}