/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr = head;
        
        while (curr != null) {
            if (curr.child == null) {
                curr = curr.next;
            } else {
                Node parent = curr;
                Node parentNext = parent.next;
                Node child = curr.child;
                Node childLast = child;
                parent.child = null;
                while (childLast != null && childLast.next != null) {
                    childLast = childLast.next;
                }
                parent.next = child;
                child.prev = parent;
                childLast.next = parentNext;
                if (parentNext != null) {
                    parentNext.prev = childLast;
                }
            }
        }
        
        return head;
        
    }
}
