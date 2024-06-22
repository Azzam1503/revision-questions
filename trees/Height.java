package trees;

public class Height {

    public static int height(Node<Integer> root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Node<Integer> root = TreeUse.treeInput();
        System.out.println(height(root));

    }
}
