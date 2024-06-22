package linkedList;

public class RemoveNthFromLast {

    public static Node<Integer> remove(Node<Integer> head, int pos) {
        if (head == null)
            return head;

        int count = pos;
        Node<Integer> fast = head;
        while (count > 0 && fast != null) {
            fast = fast.next;
            count--;
        }

        if (fast == null)
            return head.next;

        Node<Integer> slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = LL.inputLL();
        Node<Integer> head2 = remove(head, 6);
        LL.printLL(head2);
    }
}
