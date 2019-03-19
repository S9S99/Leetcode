/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode list = dummyHead;

        while (list.next != null) {
            if (list.next.val == val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return dummyHead.next;
    }
}
