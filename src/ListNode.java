
public class ListNode {
    /** Node properties **/
    int val;
    ListNode next;

    /** Constructor **/
    ListNode(int x) { val = x; }

    public void deleteNode(ListNode node) {
        if (node == null) {
            throw new IllegalArgumentException("Node list is empty");
        }
        /** Java garbage collector will remove the de-referenced node **/
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
