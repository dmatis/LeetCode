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

    public boolean isSameTree(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        } else if (node1.val == node2.val) {
            return (isSameTree(node1.left, node2.left) && isSameTree(node1.right, node2.right));
        }
        return false;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        /** Swap child nodes **/
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        /** perform swap recursively on child nodes **/
        invertTree(root.left);
        invertTree(root.right);
        /** returns the original root after inversion **/
        return root;
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        TreeNode node1 = binaryTree.new TreeNode(1);
        TreeNode node2 = binaryTree.new TreeNode(2);
        TreeNode node3 = binaryTree.new TreeNode(3);
        TreeNode node4 = binaryTree.new TreeNode(4);
        TreeNode node5 = binaryTree.new TreeNode(5);
        TreeNode node6 = binaryTree.new TreeNode(6);
        TreeNode node7 = binaryTree.new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node7;
        node2.right = node4;
        node3.right = node5;
        node3.left = node6;

        System.out.println(binaryTree.maxDepth(node1));

        System.out.println(binaryTree.isSameTree(node1, node1));
        System.out.println(binaryTree.isSameTree(node1, node3));

        System.out.println(binaryTree.invertTree(node1));
    }
}
