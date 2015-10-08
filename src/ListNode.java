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

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        ListNode tempNode = head;
        while(tempNode.next != null && tempNode.val == tempNode.next.val) {
            tempNode.next = tempNode.next.next;
        }
        head.next = tempNode.next;
        if (head.next == null) {
            return head;
        }
        deleteDuplicates(head.next);
        return head;
    }

    public static void printListNodes(ListNode head) {
        if (head == null) {
            return;
        }
        System.out.println("Node " + head.val);
        printListNodes(head.next);
    }

    public static ListNode reverseListNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode prevNode = head;
        ListNode node = reverseListNode(head.next);
        node.next = head;
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode dupNode2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        printListNodes(reverseListNode(node1));
    }
}
