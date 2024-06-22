package trees;

public class NoOfLeafNodes {

    public static int numberOfLeafNodes(Node<Integer> root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;

        int left = numberOfLeafNodes(root.left);
        int right = numberOfLeafNodes(root.right);

        return left + right;
    }

    public static void main(String[] args) {
        Node<Integer> root = TreeUse.treeInput();
        System.out.println(numberOfLeafNodes(root));
    }
}
