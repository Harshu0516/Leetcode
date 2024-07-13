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
     static ListNode rev(ListNode head) {
        ListNode temp = head;  
       ListNode prev = null;  
       while(temp != null){  
           ListNode front = temp.next;  
           temp.next = prev;  
           prev = temp;  
           temp = front; 
       }
       return prev;  

    }
    static ListNode find(ListNode temp, int k) {
        k -= 1;
    
        while (temp != null && k > 0) {
            k--;

            temp = temp.next;
        }

        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode t=head;
        ListNode p=null;
        while(t!=null){
            ListNode kNode=find(t,k);
            if(kNode==null){
                if(p!=null) p.next=t;
                break;
            }
            ListNode nNode=kNode.next;
            kNode.next=null;
            rev(t);
            if(t==head) head=kNode;
            else p.next=kNode;

            p=t;
            t=nNode;
        }
        return head;
    }
}