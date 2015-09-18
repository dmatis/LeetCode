
public class BinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode tempNode = null;

        if (root == null) {
            return null;
        }

        if (root.left == p) {
            if (root.right == q || root == q) {
                return root;
            }
            tempNode = lowestCommonAncestor(root.left, root.left, q);
            return tempNode;
        }

        if (root.right == q) {
            if (root.left == p || root == p) {
                return root;
            }
            tempNode = lowestCommonAncestor(root.right, root.right, p);
            return tempNode;
        }
        tempNode = lowestCommonAncestor(root.left,p,q);
        if (tempNode == null) {
            tempNode = lowestCommonAncestor(root.right,p,q);
        }
        return tempNode;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        TreeNode node6 = bst.new TreeNode(6);
        TreeNode node2 = bst.new TreeNode(2);
        TreeNode node0 = bst.new TreeNode(0);
        TreeNode node4 = bst.new TreeNode(4);
        TreeNode node3 = bst.new TreeNode(3);
        TreeNode node5 = bst.new TreeNode(5);
        TreeNode node8 = bst.new TreeNode(8);
        TreeNode node7 = bst.new TreeNode(7);
        TreeNode node9 = bst.new TreeNode(9);

        node6.left = node2;
        node6.right = node8;
        node2.left = node0;
        node2.right = node4;
        node4.left = node3;
        node4.right = node5;
        node8.left = node7;
        node8.right = node9;

        /** Tree structure
         *         _______6______
                  /              \
               ___2__          ___8__
              /      \        /      \
              0      _4       7       9
                    /  \
                   3   5
         */

        System.out.println("hello world");
        System.out.println(lowestCommonAncestor(node6, node2, node4).val);
        System.out.println(lowestCommonAncestor(node6, node2, node8).val);
        System.out.println(lowestCommonAncestor(node6, node3, node5).val);
        System.out.println(lowestCommonAncestor(node6, node7, node9).val);
    }
}
