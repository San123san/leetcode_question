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
        int size = size(head);
        if(size==n){
            return head.next;
        }

        ListNode curr = head;
        for(int i=0;i<size-n-1;i++){
            curr = curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }

    private static int size(ListNode head){
        int size=0;
        ListNode curr = head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        return size;
    }
}