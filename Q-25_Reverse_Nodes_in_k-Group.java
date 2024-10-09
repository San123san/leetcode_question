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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1) return head;

        ListNode current = head;
        ListNode prevTail = null;
        ListNode newHead = null;

        for(int i=0; i<k; i++){
            if(current == null) return head;
            current = current.next;
        }

        current = head;
        ListNode prev = null;

        for(int i=0; i<k; i++){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

       if(newHead == null) newHead = prev;

       if(prevTail != null) {
        prevTail.next = prev;
       }

       head.next = reverseKGroup(current, k);

       return newHead;
    }
}
