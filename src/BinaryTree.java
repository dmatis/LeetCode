import static java.lang.Math.max;

/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 **/
public class BinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        int maxHeight = 0;

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        maxHeight++;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        maxHeight = max(maxHeight + leftHeight, maxHeight + rightHeight);
        return maxHeight;
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        TreeNode node1 = binaryTree.new TreeNode(1);
        TreeNode node2 = binaryTree.new TreeNode(2);
        TreeNode node3 = binaryTree.new TreeNode(3);
        TreeNode node4 = binaryTree.new TreeNode(4);
        TreeNode node5 = binaryTree.new TreeNode(5);
        TreeNode node6 = binaryTree.new TreeNode(6);

        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        node3.right = node5;
        node5.right = node6;

        System.out.println(binaryTree.maxDepth(node1));
    }
}
