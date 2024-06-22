package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {

    public static int noOfNode(Node<Integer> root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;

        int left = noOfNode(root.left);
        int right = noOfNode(root.right);

        return 1 + left + right;
    }

    public static Node<Integer> treeInputRecursive() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        if (data == -1)
            return null;

        Node<Integer> root = new Node<Integer>(data);
        System.out.println("Enter the left child of " + data);
        Node<Integer> leftChild = treeInputRecursive();
        System.out.println("Enter the right child of " + data);
        Node<Integer> rightChild = treeInputRecursive();
        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    public static void printTree(Node<Integer> root) {
        if (root == null)
            return;

        System.out.print(root.data + ": ");
        if (root.left != null) {
            System.out.print(root.left.data + ", ");
        } else {
            System.out.print("NA, ");
        }
        if (root.right != null) {
            System.out.print(root.right.data + " ");
        } else {
            System.out.print("NA ");
        }

        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }

    public static Node<Integer> treeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data");
        int data = s.nextInt();
        if (data == -1)
            return null;

        Node<Integer> root = new Node<Integer>(data);
        Queue<Node<Integer>> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node<Integer> front = q.remove();
            System.out.println("enter the left child of : " + front.data);
            int left = s.nextInt();
            if (left != -1) {
                Node<Integer> leftChild = new Node<Integer>(left);
                front.left = leftChild;
                q.add(leftChild);
            }
            System.out.println("enter the right child of : " + front.data);
            int right = s.nextInt();

            if (right != -1) {
                Node<Integer> rightChild = new Node<Integer>(right);
                front.right = rightChild;
                q.add(rightChild);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        Node<Integer> root = treeInput();
        // Node<Integer> left = new Node<>(2);
        // Node<Integer> right = new Node<>(6);
        // Node<Integer> root = new Node<>();
        // Node<Integer> root = new Node<>();

        // root.left = left;
        // root.right = right;

        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);

        printTree(root);
        System.out.println(noOfNode(root));

    }
}
