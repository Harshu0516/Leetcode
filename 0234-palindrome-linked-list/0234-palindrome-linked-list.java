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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode f=temp.next;
            temp.next=prev;
            prev=temp;
            temp=f;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode nH=reverse(s.next);
        ListNode x=head;
        ListNode y=nH;
        while(y!=null){
            if(x.val!=y.val){
                 reverse(nH);
                return false;
            }
            x=x.next;
            y=y.next;
        }
         reverse(nH);
        return true;
    }
}