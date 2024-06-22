package linkedList;

public class InsertNode {

    public static void insertNode(Node<Integer> head, int pos, int data) {
        Node<Integer> temp = head;
        int currPos = 1;
        while (currPos < pos) {
            if (temp.next != null) {
                temp = temp.next;
            } else {
                System.out.println("Linked LIst is shorter than the position");
                return;
            }
            System.out.println("loop run");
            currPos++;
        }
        System.out.println(temp.data);
        Node<Integer> newNode = new Node<>(data);
        if (temp.next == null) {
            temp.next = newNode;
        } else {
            Node<Integer> temp2 = temp.next;
            temp.next = newNode;
            newNode.next = temp2;
        }

    }

    // public static Node<Integer> insertNode(Node<Integer> head, int pos, int data)
    // {
    // Node<Integer> newNode = new Node<>(data);
    // if (pos == 0) {
    // newNode.next = head;
    // return newNode;
    // }
    // Node<Integer> temp = head;
    // int currPos = 0;
    // while (currPos < pos - 1 && temp != null) {
    // currPos++;
    // temp = temp.next;
    // }
    // if (temp != null) {
    // newNode.next = temp.next;
    // temp.next = newNode;
    // }
    // return head;

    // }

    public static void main(String[] args) {
        Node<Integer> head = LL.inputLL();
        insertNode(head, 3, 100);
        LL.printLL(head);
    }
}
