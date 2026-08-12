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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        
        ListNode curr=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode l1=head;
        ListNode l2=prev;
        
        while(l1!=null && l2!=null){
            ListNode next1=l1.next;
            ListNode next2=l2.next;
            l1.next=l2;
            l2.next=next1;
            l1=next1;
            l2=next2;
        }

        
    }
}
