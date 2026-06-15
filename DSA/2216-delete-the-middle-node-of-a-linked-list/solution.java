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
    public ListNode deleteMiddle(ListNode head) {
        int count = 1;
        ListNode h = head;
        if(head.next==null || head==null){return null;}
        while (h.next != null) {
            count++;
            h = h.next;
        }
        int mid = 0;
        mid = (count / 2) - 1;
        ListNode curr = head;
        for (int i = 0; i < mid; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
