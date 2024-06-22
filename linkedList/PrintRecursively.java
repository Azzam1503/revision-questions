package linkedList;

public class PrintRecursively {
    public static void main(String[] args) {
        Node<Integer> head = LL.inputLL();
        // Node<Integer> newHead = insertRecursively(head, 80, 3);
        Node<Integer> newHead = deleteRecursively(head, 3);
        printRecursively(newHead);
    }

    private static Node<Integer> insertRecursively(Node<Integer> head, int data, int pos) {
        if (head == null)
            return head;
        if (pos == 0) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head.next == null) {
                head.next = newNode;
            } else {
                newNode.next = head;
            }

            return newNode;
        }
        head.next = insertRecursively(head.next, data, pos - 1);
        return head;
    }

    public static Node<Integer> deleteRecursively(Node<Integer> head, int pos) {
        if (head == null)
            return head;

        if (pos == 0) {
            return head.next;
        }

        head.next = deleteRecursively(head.next, pos - 1);
        return head;
    }

    private static void printRecursively(Node<Integer> head) {

        if (head == null)
            return;
        System.out.println(head.data);
        printRecursively(head.next);
    }
}
