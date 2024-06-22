package trees;

public class RemoveLeafNodes {

    public static Node<Integer> removeLeafNodes(Node<Integer> root) {
        if (root == null)
            return null;
        if (root.left == null && root.right == null)
            return null;

        Node<Integer> left = removeLeafNodes(root.left);
        Node<Integer> right = removeLeafNodes(root.right);

        root.left = left;
        root.right = right;

        return root;
    }

    public static void main(String[] args) {
        Node<Integer> root = TreeUse.treeInput();
        Node<Integer> root2 = removeLeafNodes(root);
        TreeUse.printTree(root2);
    }
}
