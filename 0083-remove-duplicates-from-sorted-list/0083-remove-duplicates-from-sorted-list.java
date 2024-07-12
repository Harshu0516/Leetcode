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
    public ListNode deleteDuplicates(ListNode head) {
         ListNode t=head;
        while(t!=null){
            
            ListNode N=t.next;
            
            while(N!=null && t.val==N.val) N=N.next;

            t.next=N;
            // if(N!=null) N.back=t;

            t=N;
        }
        return head;
        
    }
}