package linkedList;

import java.util.Scanner;

public class LL {

    public static Node<Integer> inputLL() {
        Scanner s = new Scanner(System.in);
        Node<Integer> head = null;
        Node<Integer> tail = null;
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> curr = new Node<>(data);
            if (head == null) {
                head = curr;
                tail = curr;
            } else {
                tail.next = curr;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        s.close();
        return head;
    }

    public static void printLL(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = inputLL();
        printLL(head);

        System.out.println("From ll main");
    }
}
