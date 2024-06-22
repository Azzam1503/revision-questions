package linkedList;

import java.util.Stack;

public class ReverseLL {
    public static Node<Integer> reverseLL(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;

        Node<Integer> smallHead = reverseLL(head.next);
        Node<Integer> tail = smallHead;

        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;

        return smallHead;

    }

    public static Node<Integer> reverseWithStack(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;
        Stack<Node<Integer>> st = new Stack<>();

        Node<Integer> temp = head;
        while (temp != null) {
            st.add(temp);
            temp = temp.next;
        }

        Node<Integer> newHead = st.pop();
        Node<Integer> temp2 = newHead;

        while (!st.isEmpty()) {
            temp2.next = st.pop();
            temp2 = temp2.next;
        }

        temp2.next = null;
        return newHead;

    }

    public static Node<Integer> reverseIteratively(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;

        Node<Integer> front = null;
        Node<Integer> prev = null;
        Node<Integer> temp = head;

        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        System.out.println(temp);
        System.out.println(front);
        return prev;
    }

    public static Node<Integer> reverseRecursively(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;

        Node<Integer> newHead = reverseRecursively(head.next);
        Node<Integer> front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = LL.inputLL();
        Node<Integer> reversedHead = reverseRecursively(head);
        LL.printLL(reversedHead);
    }
}
