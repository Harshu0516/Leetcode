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
    static ListNode find(ListNode t,int k){
        int c=1;
        while(t!=null){
            if(c==k) return t;
            c++;
            t=t.next;
        }
        return t;
    }
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || k==0) return head;
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0) return head;
        k=k%len;
        int pos=len-k;
        tail.next=head;
        ListNode KthNode=find(head,pos);
        head=KthNode.next;
        KthNode.next=null;
        return head;
    }
}