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
    // ArrayList<Integer> ans=new ArrayList<>();
    static int GCD(int x,int y){
        if(y==0){
            // ans.add(x);
           return x;
        }
        else return GCD(y, Math.abs(x-y));
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode t1=head;
        ListNode t2=head.next;
        while(t2!=null){
            int x=GCD(t1.val,t2.val);
            ListNode temp=new ListNode(x);
            
            t1.next=temp;
            temp.next=t2;

            t1=t2;
            t2=t2.next;
        }
        return head;
    }
    
}