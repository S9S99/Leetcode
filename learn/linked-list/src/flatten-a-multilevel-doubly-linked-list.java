/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
    Node prev;
    public Node flatten(Node head) {
        Node cur = head;
        while (cur != null) {
          if (cur.child != null) {
            Node next = cur.next;
            cur.child.prev = cur;
            cur.next = flatten(cur.child);
            cur.child = null;
						
            if (next != null) {
              prev.next = next;
              next.prev = prev;
            }
          }

          prev = cur;
          cur = cur.next;
        }

        return head; 	
    }
}
