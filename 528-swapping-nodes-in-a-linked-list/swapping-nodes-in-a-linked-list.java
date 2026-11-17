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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        ListNode first = head;
        for (int i = 0; i < k - 1; i++) {
            first = first.next;
        }
        ListNode second = head;
        for (int i = 1; i < len - k + 1; i++) {
            second = second.next;
        }
        int x = first.val;
        first.val = second.val;
        second.val = x;
        return head;

    }
}