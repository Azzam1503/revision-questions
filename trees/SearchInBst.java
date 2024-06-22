package trees;

public class SearchInBst {
    public static Node<Integer> search(Node<Integer> root, int data) {
        if (root == null)
            return null;

        if (root.data == data) {
            return root;
        } else if (root.data < data) {
            return search(root.right, data);
        } else {
            return search(root.left, data);
        }
    }

    public static void main(String[] args) {
        Node<Integer> root = TreeUse.treeInput();
        Node<Integer> ans = search(root, 12);
        System.out.println(ans.data);
    }
}
