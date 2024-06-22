package trees;

class Pair {
    int min;
    int max;
    boolean isBst;

    public Pair(int min, int max, boolean isBst) {
        this.min = min;
        this.max = max;
        this.isBst = isBst;
    }
}

public class CheckIfBst {

    public static Pair checkIfBst(Node<Integer> root) {
        if (root == null) {
            return new Pair(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }

        Pair left = checkIfBst(root.left);
        Pair right = checkIfBst(root.right);

        boolean ifThisBst = true;

        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        if (left.max >= root.data) {
            ifThisBst = false;
        }
        if (right.min < root.data) {
            ifThisBst = false;
        }
        if (!left.isBst || !right.isBst) {
            ifThisBst = false;
        }

        return new Pair(min, max, ifThisBst);
    }

    public static void main(String[] args) {
        Node<Integer> root = TreeUse.treeInput();
        Pair check = checkIfBst(root);
        System.out.println(check.isBst);
    }
}
