/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        
        ListNode cur = head;
        int count = 1;
        while (cur.next != null) {
            count++;
            cur = cur.next;
        }
        cur = head;
        ListNode front = null;
        ListNode back = null;
        for (int i = 0; i < count / 2; ++i) {
            back = cur.next;
            cur.next = front;
            front = cur;
            cur = back;
        }
        if (count % 2 == 1) {
            cur = cur.next;
        }
        while (cur != null) {
            if (cur.val != front.val) {
                return false;
            }
            cur = cur.next;
            front = front.next;
        }
        return true;
    }
}
