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
        if(head==null||head.next==null){
            return null;
        }
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        ListNode dummy=new ListNode(-1, head);
        ListNode prev=dummy;
        count-=n;
        while(count!=0){
            prev=prev.next;
            count--;
        }
        prev.next=prev.next.next;
        return dummy.next;
    }
}
