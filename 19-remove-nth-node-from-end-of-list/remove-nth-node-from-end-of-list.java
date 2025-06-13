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
        ListNode neww_list = new_list;
        int count = 1;
        while(neww_list!=null){
            count++;
            neww_list=neww_list.next;
        }
        if(count+1 == n){
            new_list=new_list.next;
            return head;
        }
        for(int i = 1;i<count-n-1;i++){
            new_list=new_list.next;
        }
        new_list.next= new_list.next.next;
        return head;
    }*/
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // The core logic is handled by the helper method.
        // We pass the original head and n to the helper.
        return removeElement(head, n);
    }

    /**
     * Helper method to remove the Nth node from the end of the list.
     * This method calculates the length, handles the head removal edge case,
     * and then traverses to the node before the target for removal.
     * @param currentHead The head of the linked list.
     * @param n The position from the end to remove.
     * @return The head of the modified list.
     */
    private ListNode removeElement(ListNode currentHead, int n) {
        // Edge case: If the list is empty, there's nothing to remove.
        if (currentHead == null) {
            return null;
        }

        // Step 1: Calculate the total length of the linked list.
        // We use a temporary pointer 'temp' to traverse without altering 'currentHead'.
        int length = 0;
        ListNode temp = currentHead;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: Handle the special case where the node to be removed is the head itself.
        // This occurs if 'n' is equal to the total 'length' of the list.
        if (n == length) {
            // If the head is removed, the new head becomes the original head's next node.
            return currentHead.next;
        }

        // Step 3: Traverse the list to find the node located *before* the Nth node from the end.
        // The position of this "pre-target" node from the beginning is (length - n - 1) if using 0-based index
        // or (length - n) if using 1-based index (meaning we need to stop before the target).
        // Since we want to reach the node *before* the one to be removed, we need to iterate 'length - n - 1' times.
        ListNode nodeBeforeTarget = currentHead;
        // The number of steps to take from the beginning to reach the node *before* the one to remove.
        // Example: List [1,2,3], n=1 (remove 3). Length=3. We need to reach node '2'.
        // Steps = 3 (length) - 1 (n) - 1 (to be one before target) = 1 step.
        // Start at 1, take 1 step, reach 2.
        int stepsToReachNodeBeforeTarget = length - n - 1;

        // Iterate to move 'nodeBeforeTarget' to its correct position.
        for (int i = 0; i < stepsToReachNodeBeforeTarget; i++) {
            if (nodeBeforeTarget.next == null) {
                // This check is mainly for safety, though 'n' should be valid within length.
                return currentHead; // Should not happen with valid inputs.
            }
            nodeBeforeTarget = nodeBeforeTarget.next;
        }

        // Step 4: Perform the removal operation.
        // At this point, 'nodeBeforeTarget' is the node immediately preceding the one to be removed.
        // We skip the target node by setting 'nodeBeforeTarget.next' to 'nodeBeforeTarget.next.next'.
        if (nodeBeforeTarget.next != null) { // Ensure there is a node to remove.
            nodeBeforeTarget.next = nodeBeforeTarget.next.next;
        }

        // Step 5: Return the original head of the list.
        // If the head itself wasn't removed (handled in Step 2), 'currentHead' remains the head.
        return currentHead;
    }
}