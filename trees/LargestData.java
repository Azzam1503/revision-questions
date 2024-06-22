package trees;

public class LargestData {
    static int largest = Integer.MIN_VALUE;

    public static int largestData(Node<Integer> root) {
        if (root == null)
            return -1;

        int left = largestData(root.left);
        int right = largestData(root.right);

        return Math.max(root.data, Math.max(left, right));
    }

    public static void main(String[] args) {
        Node<Integer> root = TreeUse.treeInput();
        System.out.println(largestData(root));
    }
}
