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
        ListNode Right = head;
        if (head == null || head.next == null) {
            return null;
        }
        for (int i = 0; i < n ; i++) {
            Right = Right.next;
        }
        ListNode h= new ListNode();
        h.next=head;
        ListNode Left = h;
        while (Right!= null) {
            Left = Left.next;
            Right = Right.next;
        }
        Left.next=Left.next.next;
        return h.next;
    }
}
