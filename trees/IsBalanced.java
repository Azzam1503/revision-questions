package trees;

class Pair {
    int height;
    boolean isBalanced;

    Pair(int height, boolean isBalanced) {
        this.height = height;
        this.isBalanced = isBalanced;
    }
}

public class IsBalanced {

    public static Pair checkIsBalanced(Node<Integer> root) {
        if (root == null) {
            return new Pair(0, true);
        }
        Pair left = checkIsBalanced(root.left);
        Pair right = checkIsBalanced(root.right);

        int leftHeight = left.height;
        int rightHeight = right.height;

        if (left.isBalanced == false || right.isBalanced == false) {
            return new Pair(Math.max(leftHeight, rightHeight) + 1, false);

        }

        int diff = Math.abs(rightHeight - leftHeight);

        if (diff > 1) {
            return new Pair(Math.max(leftHeight, rightHeight) + 1, false);
        }

        return new Pair(Math.max(leftHeight, rightHeight) + 1, true);
    }

    public static void main(String[] args) {
        Node<Integer> root = TreeUse.treeInput();
        Pair ans = checkIsBalanced(root);
        System.out.println(ans.height);
        System.out.println(ans.isBalanced);
    }
}
